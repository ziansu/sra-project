public static ml.shifu.shifu.container.obj.ModelConfig loadModelConfig(java.lang.String path, ml.shifu.shifu.container.obj.RawSourceData.SourceType sourceType) throws java.io.IOException {
    ml.shifu.shifu.container.obj.ModelConfig modelConfig = ml.shifu.shifu.util.CommonUtils.loadJSON(path, sourceType, ml.shifu.shifu.container.obj.ModelConfig.class);
    if ((modelConfig.getTrain().getGridConfigFile()) != null) {
        modelConfig.getTrain().setGridConfigFileContent(ml.shifu.shifu.util.CommonUtils.loadFileContent(path, sourceType));
    }
    return modelConfig;
}