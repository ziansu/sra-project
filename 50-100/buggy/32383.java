protected void asyncRedraw() {
    spoon.getDisplay().asyncExec(new java.lang.Runnable() {
        public void run() {
            if (!(isDisposed())) {
                redraw();
                pushSession.stop();
            }
        }
    });
}