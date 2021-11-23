private void prepareSelect() throws java.lang.Exception {
    setUp(ModelStep.VARSELECT);
    validateParameters();
    if (isToReset) {
        ml.shifu.shifu.core.processor.VarSelectModelProcessor.log.info("Reset all selections data including type,final select etc!");
        resetAllFinalSelect();
    }
    if ((this.modelConfig.getVarSelectFilterNum()) > 0) {
        for (ml.shifu.shifu.container.obj.ColumnConfig columnConfig : this.columnConfigList) {
            if (columnConfig.isFinalSelect()) {
                columnConfig.setFinalSelect(false);
            }
        }
    }
    syncDataToHdfs(super.modelConfig.getDataSet().getSource());
}