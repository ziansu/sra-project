public boolean hasKey(java.lang.String key) {
    return (this.cache.containsKey(key)) && ((this.cache.get(key)) != null);
}