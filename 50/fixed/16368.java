public int getInt(java.lang.String key) {
    java.lang.String ret = getProperty(key);
    return ret == null ? null : java.lang.Integer.parseInt(ret);
}