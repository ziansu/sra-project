@java.lang.Override
protected synchronized void fireDataChange() {
    if ((updateDelay) > 0) {
        if (!(duringDelay)) {
            org.eclipse.swt.widgets.Display.getCurrent().timerExec(updateDelay, fireUpdate);
            duringDelay = true;
        }
    }else
        super.fireDataChange();
    
}