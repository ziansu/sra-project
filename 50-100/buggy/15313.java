private boolean statusOK(jmri.jmrit.logix.OBlock block) {
    if ((_engineer) != null) {
        if (((_engineer.getRunState()) == (jmri.jmrit.logix.Warrant.WAIT_FOR_CLEAR)) || ((_engineer.getRunState()) == (jmri.jmrit.logix.Warrant.HALT))) {
            _message = jmri.jmrit.logix.Bundle.getMessage("BlockRougeOccupied", block.getDisplayName());
            return false;
        }
        _engineer.clearWaitForSync();
    }
    return true;
}