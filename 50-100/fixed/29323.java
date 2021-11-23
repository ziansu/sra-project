public java.util.Map<java.lang.Integer, java.lang.Object> save() {
    java.util.Map<java.lang.Integer, java.lang.Object> valuemap = new java.util.HashMap<>();
    for (java.lang.Integer key : getParameters().keySet()) {
        valuemap.put(key, getParameter(key).getValue());
    }
    return valuemap;
}