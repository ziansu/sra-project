public void run() {
    if (((layoutWrapper) != null) && ((this.relativeLayout) != null)) {
        this.relativeLayout.removeView(layoutWrapper);
        this.relativeLayout.requestLayout();
        layoutWrapper = null;
    }
    removed[0] = true;
}