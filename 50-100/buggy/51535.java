protected void doPerformAction(org.zkoss.zk.ui.event.Event e) {
    if ((e.getTarget()) == (userPinTimer)) {
        pos.setIsCorrectUserPin(false);
        userPinTimer.stop();
        return ;
    }
    if (userPinTimer.isRunning())
        return ;
    
    doPerformAction();
    return ;
}