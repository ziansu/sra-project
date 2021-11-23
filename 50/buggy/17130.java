public void setModeAndReset(boolean runMode, de.neemann.digital.gui.sync.Sync modelSync) {
    this.modelSync = modelSync;
    if (runMode)
        mouseRun.activate();
    else
        mouseNormal.activate();
    
    requestFocusInWindow();
    circuit.clearState();
}