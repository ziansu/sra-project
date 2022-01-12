public boolean getBoolean(java.lang.String key, boolean defValue) {
    java.lang.Object obj = mMap.get(key);
    if (obj == null) {
        return defValue;
    }
    return ((boolean) (obj));
}