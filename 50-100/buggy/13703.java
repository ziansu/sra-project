void endWorkFlow(boolean status) {
    applet.removeAll();
    currentIndex = 0;
    applet.add(homeFunc);
    com.canon.meap.confirmedfax.impl.NotifyExecListener.getInstance().notifyEndWorkFlow(status);
    if ((disp) == true) {
        com.canon.meap.confirmedfax.impl.NotifyDispListener.getInstance().notifyHideWorkFlow();
        disp = false;
    }
    applet.invalidate();
    applet.validate();
}