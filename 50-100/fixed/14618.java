private boolean prepareToLeaveTab(int which) {
    if (which == 0) {
        return addInputsPanel1.prepareToAdvance();
    }else
        if (which == 1) {
            return configureTriggerPanel1.prepareToAdvance();
        }else
            if (which == 2) {
                return sendAndMonitorPanel1.prepareToAdvance();
            }
        
    
    return true;
}