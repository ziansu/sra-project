protected void asyncRedraw() {
    if (spoon.getDisplay().isDisposed()) {
        return ;
    }
    spoon.getDisplay().asyncExec(new java.lang.Runnable() {
        public void run() {
            if (!(isDisposed())) {
                redraw();
                pushSession.stop();
            }
        }
    });
}