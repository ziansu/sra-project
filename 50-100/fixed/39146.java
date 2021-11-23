public ru.otus.l121.orm.cache.CacheElement<K, V> get(K key) {
    java.lang.ref.SoftReference softReference = elements.get(key);
    if (softReference == null) {
        return null;
    }
    ru.otus.l121.orm.cache.CacheElement<K, V> element = ((ru.otus.l121.orm.cache.CacheElement<K, V>) (softReference.get()));
    if (element != null) {
        (hit)++;
        element.setAccessed();
    }else {
        (miss)++;
    }
    return element;
}