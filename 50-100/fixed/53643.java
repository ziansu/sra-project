@java.lang.Override
protected void onSizeChanged(int xNew, int yNew, int xOld, int yOld) {
    super.onSizeChanged(xNew, yNew, xOld, yOld);
    if (!(mLockSelectionOnResize)) {
        if (yNew < yOld) {
            this.postDelayed(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    setSelection(((getCount()) - 1));
                }
            }, 100);
        }
    }
}