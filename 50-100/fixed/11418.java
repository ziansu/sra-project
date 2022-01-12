private void updateCurrentMemoryMode() {
    org.exbin.framework.deltahex.HexStatusApi.MemoryMode memoryMode = HexStatusApi.MemoryMode.RAM_MEMORY;
    if ((codeArea.getEditationAllowed()) == (org.exbin.deltahex.EditationAllowed.READ_ONLY)) {
        memoryMode = HexStatusApi.MemoryMode.READ_ONLY;
    }else
        if ((codeArea.getData()) instanceof org.exbin.deltahex.delta.DeltaDocument) {
            memoryMode = HexStatusApi.MemoryMode.DELTA_MODE;
        }
    
    if ((hexStatus) != null) {
        hexStatus.setMemoryMode(memoryMode);
    }
}