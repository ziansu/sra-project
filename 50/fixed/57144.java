public int getInt(java.lang.String key, int defValue) {
    java.lang.Object obj = mMap.get(key);
    if (obj == null) {
        return defValue;
    }
    return ((int) (obj));
}