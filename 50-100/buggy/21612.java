private void initMessages() {
    if ((vm.isRunning()) && (!(vm.getHasAgent()))) {
        setMessage(org.ovirt.engine.ui.uicompat.ConstantsManager.getInstance().getConstants().liveSnapshotWithNoGuestAgentMsg());
    }
    if (isValidateByVmSnapshots()) {
        initVmSnapshots();
    }else {
        initVmDisks();
    }
}