public void setHeader(java.lang.String name, java.lang.String value) {
    if (name != null) {
        java.util.List<java.lang.String> values = headers.get(name);
        if (values == null) {
            values = new java.util.ArrayList<>();
            headers.put(name, values);
        }else {
            values.clear();
        }
        if (value != null) {
            values.add(value);
        }else {
            headers.remove(name);
        }
    }
}