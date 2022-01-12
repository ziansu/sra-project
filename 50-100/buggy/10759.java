protected com.sproutigy.libs.luceneplus.core.indices.LuceneIndex instantiate(java.lang.String name) throws java.io.IOException {
    com.sproutigy.libs.luceneplus.core.indices.LuceneIndex index = instantiated.get(name);
    if (index == null) {
        synchronized(lock) {
            index = instantiated.get(name);
            if (index == null) {
                index = prepareIndex(name, provideDirectorySupplier(name));
                if (isAutoOpen()) {
                    index.open();
                }
                instantiated.put(name, index);
                onInstantiate(index, name);
            }
        }
    }
    return index;
}