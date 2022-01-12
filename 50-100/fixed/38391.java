private void clearEnvironment() {
    initRuntimeInstallsByTypeMap();
    initDefaultRuntimeInstallsMap();
    fOriginalRuntimesTimeStamp.clear();
    fLastRuntimesTimeStamp.clear();
    currentRuntimeTypeId = getRuntimeTypeId(0);
    if ((currentRuntimeTypeId) != null) {
        fJSTypeCombo.select(0);
        fJSRuntimesBlock.setRuntimeType(org.eclipse.wst.jsdt.core.runtime.JSRuntimeManager.getJSRuntimeType(currentRuntimeTypeId));
        initDefaultRuntime();
    }
    backupTimeStamp();
}