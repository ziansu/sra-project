private void initMessages() {
    if (vm.isRunning()) {
        setMessage(org.ovirt.engine.ui.uicompat.ConstantsManager.getInstance().getConstants().liveSnapshotWithNoGuestAgentMsg());
    }
    if (isValidateByVmSnapshots()) {
        initVmSnapshots();
    }else {
        initVmDisks();
    }
}