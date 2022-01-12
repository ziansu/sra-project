public java.lang.String save() {
    java.util.Map<java.lang.Integer, java.lang.Object> valuemap = new java.util.HashMap<>();
    for (java.lang.Integer key : getParameters().keySet()) {
        valuemap.put(key, getParameter(key).getValue());
    }
    org.yaml.snakeyaml.Yaml dumper = new org.yaml.snakeyaml.Yaml();
    return dumper.dump(valuemap);
}