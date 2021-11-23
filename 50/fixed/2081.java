public void put(java.lang.String key, java.lang.Object value) {
    if (value == null) {
        this.data.remove(key);
    }else {
        this.data.put(key, value);
    }
}