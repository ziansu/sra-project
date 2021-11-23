protected eu.hyvar.feature.configuration.HyConfiguration loadConfigurationModel() {
    return ((eu.hyvar.feature.configuration.HyConfiguration) (de.christophseidl.util.ecore.EcoreIOUtil.loadAccompanyingModel(modelWrapped.getModel(), eu.hyvar.feature.configuration.util.HyConfigurationUtil.getConfigurationModelFileExtensionForXmi())));
}