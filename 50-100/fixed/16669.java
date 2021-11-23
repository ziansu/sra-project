public int get(java.lang.String key) {
    if (key == null) {
        throw new java.lang.NullPointerException("ST.get(): key is null");
    }else {
        for (int i = 0; i < (n); i++) {
            if (key.equals(keys[i])) {
                return values[i];
            }
        }
        return -1;
    }
}