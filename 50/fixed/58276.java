public configuration.parameters.PluginParameter<T> setAdditionalParameters(java.util.List<configuration.parameters.Parameter> additionalParameters) {
    if (additionalParameters.isEmpty())
        return this;
    
    this.additionalParameters = additionalParameters;
    initChildList();
    return this;
}