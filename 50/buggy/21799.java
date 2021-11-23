public java.lang.Integer getAsInt(java.lang.String key) {
    if ((values.get(key)) == null) {
        return null;
    }
    return java.lang.Double.valueOf(values.get(key).toString()).intValue();
}