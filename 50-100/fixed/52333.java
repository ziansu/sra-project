private void prepareSelect() throws java.lang.Exception {
    setUp(ModelStep.VARSELECT);
    validateParameters();
    if (isToReset) {
        ml.shifu.shifu.core.processor.VarSelectModelProcessor.log.info("Reset all selections data including type,final select etc!");
        resetAllFinalSelect();
    }
    syncDataToHdfs(super.modelConfig.getDataSet().getSource());
}