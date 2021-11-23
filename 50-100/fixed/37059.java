private void setDefaultValue(java.lang.String key, int value) {
    if (!(prop.contains(key))) {
        prop.setProperty(key, java.lang.Integer.toString(value));
    }
    defaults.put(key, java.lang.Integer.toString(value));
}