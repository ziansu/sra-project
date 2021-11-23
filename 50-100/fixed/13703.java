void endWorkFlow(boolean status) {
    if ((disp) == true) {
        com.canon.meap.confirmedfax.impl.NotifyDispListener.getInstance().notifyHideWorkFlow();
        disp = false;
    }
    applet.removeAll();
    currentIndex = 0;
    applet.add(homeFunc);
    com.canon.meap.confirmedfax.impl.NotifyExecListener.getInstance().notifyEndWorkFlow(status);
    applet.invalidate();
    applet.validate();
}