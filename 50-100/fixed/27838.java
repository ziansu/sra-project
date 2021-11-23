public void checkInit(java.lang.Boolean lastVersion, java.lang.Boolean readonly, boolean load) throws org.talend.commons.exception.PersistenceException {
    if ((loadedProcess) instanceof org.talend.core.ui.ILastVersionChecker) {
        ((org.talend.core.ui.ILastVersionChecker) (loadedProcess)).setLastVersion(lastVersion);
    }
    if (load) {
        loadProcess();
    }else {
        saveProcessBefore();
        saveProcess(null, null, true);
    }
    if (readonly == null) {
        readonly = checkReadOnly();
        setReadOnly(readonly);
    }else {
        setReadOnly(readonly);
    }
}