public com.jayway.jsonpath.Configuration build() {
    if ((null == (jsonProvider)) || (null == (mappingProvider))) {
        com.jayway.jsonpath.Configuration.Defaults defaults = com.jayway.jsonpath.Configuration.getEffectiveDefaults();
        if ((jsonProvider) == null) {
            jsonProvider = defaults.jsonProvider();
        }
        if ((mappingProvider) == null) {
            mappingProvider = defaults.mappingProvider();
        }
    }
    return new com.jayway.jsonpath.Configuration(jsonProvider, mappingProvider, options, evaluationListener);
}