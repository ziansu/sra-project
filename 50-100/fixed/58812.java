protected double getDropoutFromConfig(java.util.Map<java.lang.String, java.lang.Object> layerConfig) throws org.deeplearning4j.nn.modelimport.keras.InvalidKerasConfigurationException {
    java.util.Map<java.lang.String, java.lang.Object> innerConfig = org.deeplearning4j.nn.modelimport.keras.KerasLayer.getInnerLayerConfigFromConfig(layerConfig);
    double dropout = 1.0;
    if (innerConfig.containsKey(org.deeplearning4j.nn.modelimport.keras.KerasLayer.LAYER_FIELD_DROPOUT)) {
        dropout = 1.0 - ((double) (innerConfig.get(org.deeplearning4j.nn.modelimport.keras.KerasLayer.LAYER_FIELD_DROPOUT)));
    }else
        if (innerConfig.containsKey(org.deeplearning4j.nn.modelimport.keras.KerasLayer.LAYER_FIELD_DROPOUT_W)) {
            dropout = 1.0 - ((double) (innerConfig.get(org.deeplearning4j.nn.modelimport.keras.KerasLayer.LAYER_FIELD_DROPOUT_W)));
        }
    
    return dropout;
}