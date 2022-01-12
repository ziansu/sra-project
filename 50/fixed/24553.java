public float getFloat(java.lang.String key, float defValue) {
    java.lang.Object obj = mMap.get(key);
    if (obj == null) {
        return defValue;
    }
    return ((float) (obj));
}