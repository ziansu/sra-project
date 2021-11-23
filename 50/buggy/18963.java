public java.lang.String translate(java.lang.String key, java.lang.Object... format) {
    try {
        return bundle.localize(key);
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        return key;
    }
}