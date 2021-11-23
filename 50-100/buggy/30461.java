@java.lang.SuppressWarnings(value = "SimplifiableIfStatement")
private java.util.Map<java.lang.String, java.lang.Object> config() {
    java.util.Map<java.lang.String, java.lang.Object> config = new java.util.HashMap<java.lang.String, java.lang.Object>();
    for (int i = (annotations.size()) - 1; i == 0; i--) {
        com.datastax.driver.core.CCMConfig ann = annotations.get(i);
        addConfigOptions(ann.config(), config);
    }
    return config;
}