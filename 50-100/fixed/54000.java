@java.lang.Override
protected void setConfiguration(cz.cuni.mff.xrg.uv.boost.extensions.FaultTolerance.Configuration_V1 conf) throws eu.unifiedviews.dpu.config.DPUConfigException {
    checkEnabled.setValue(conf.isEnabled());
    txtRetryCount.setValue(java.lang.Integer.toString(conf.maxRetryCount));
    final java.lang.StringBuilder exceptionList = new java.lang.StringBuilder();
    for (java.lang.String item : conf.getExceptionNames()) {
        if (!(item.isEmpty())) {
            exceptionList.append(item);
            exceptionList.append(";");
        }
    }
    txtExceptionNames.setValue(exceptionList.toString());
}