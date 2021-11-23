public java.util.LinkedHashMap<java.lang.String, java.lang.Object> findByName(java.lang.String name) {
    for (java.util.LinkedHashMap<java.lang.String, java.lang.Object> t : NodeInfo) {
        if (name.equals(t.get("name"))) {
            return t;
        }
    }
    return null;
}