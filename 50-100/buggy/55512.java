@java.lang.Override
public void zoomChanged(double arg0) {
    if ((getViewer()) == null) {
        return ;
    }
    getViewer().getControl().getDisplay().timerExec(100, new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            updateConnectionList();
        }
    });
}