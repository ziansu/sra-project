public void addHeader(java.lang.String name, java.lang.String value) {
    if ((name != null) && (value != null)) {
        java.util.List<java.lang.String> values = headers.get(name);
        if (values == null) {
            values = new java.util.ArrayList<>();
            headers.put(name, values);
        }
        values.add(value);
    }
}