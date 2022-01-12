public com.persistentbit.core.collections.PList<java.lang.String> getAll(java.lang.String name) {
    return com.persistentbit.core.collections.PList.from(snippets.getOpt(name.toLowerCase()).orElseThrow(() -> new java.lang.IllegalArgumentException((((("Can't find snippet '" + name) + "' in  '") + (resourcePath)) + "'"))));
}