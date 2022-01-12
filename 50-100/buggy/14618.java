private boolean prepareToLeaveTab(int which) {
    if (which == 0) {
        java.lang.System.out.println("Preapring to leave addInputs");
        return addInputsPanel1.prepareToAdvance();
    }else
        if (which == 1) {
            java.lang.System.out.println("Preparing to leave trigger");
            return configureTriggerPanel1.prepareToAdvance();
        }else
            if (which == 2) {
                return sendAndMonitorPanel1.prepareToAdvance();
            }
        
    
    return true;
}