public java.lang.String getParameter(java.lang.String key) {
    java.util.List<java.lang.String> values = this.query_pairs.get(key);
    if ((values == null) || (values.isEmpty())) {
        return null;
    }
    return values.get(0);
}