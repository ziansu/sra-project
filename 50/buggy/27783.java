public boolean contains(java.lang.String key) {
    if (key == null) {
        throw new java.lang.IllegalArgumentException("key is null");
    }
    return (get(key)) != null;
}