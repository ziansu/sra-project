public static com.silicolife.textmining.machinelearning.biotml.core.interfaces.IBioTMLModelConfigurator defaultConfiguration(java.lang.String modelClassType, java.lang.String modelIEType) {
    com.silicolife.textmining.machinelearning.biotml.core.models.BioTMLModelConfigurator configuration = new com.silicolife.textmining.machinelearning.biotml.core.models.BioTMLModelConfigurator(modelClassType, modelIEType);
    configuration.setAlgorithmType(BioTMLAlgorithm.malletsvm);
    configuration.setNumThreads(5);
    return configuration;
}