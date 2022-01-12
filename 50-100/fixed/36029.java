protected void asyncRedraw() {
    if (spoon.getDisplay().isDisposed()) {
        return ;
    }
    spoon.getDisplay().asyncExec(new java.lang.Runnable() {
        public void run() {
            if (!(org.pentaho.di.ui.spoon.trans.TransGraph.this.isDisposed())) {
                org.pentaho.di.ui.spoon.trans.TransGraph.this.redraw();
            }
        }
    });
}