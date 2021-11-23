private void clearEnvironment() {
    initRuntimeInstallsByTypeMap();
    initDefaultRuntimeInstallsMap();
    fOriginalRuntimesTimeStamp.clear();
    fLastRuntimesTimeStamp.clear();
    fJSTypeCombo.select(0);
    currentRuntimeTypeId = getRuntimeTypeId(0);
    fJSRuntimesBlock.setRuntimeType(org.eclipse.wst.jsdt.core.runtime.JSRuntimeManager.getJSRuntimeType(currentRuntimeTypeId));
    initDefaultRuntime();
    backupTimeStamp();
}