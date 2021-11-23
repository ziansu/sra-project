public int getPortbyName(java.lang.String name) {
    for (java.util.LinkedHashMap<java.lang.String, java.lang.Object> t : NodeInfo) {
        if (name.equals(t.get("name"))) {
            if ((t.get("port")) != null) {
                return ((java.lang.Integer) (t.get("port"))).intValue();
            }
        }
    }
    return -1;
}