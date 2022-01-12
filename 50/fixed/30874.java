public T getData(java.lang.String key) {
    key = key.toUpperCase().trim();
    return getSearchTreeStart(key).data.get(key);
}