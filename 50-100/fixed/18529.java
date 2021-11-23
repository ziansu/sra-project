public void run() {
    try {
        if (((layoutWrapper) != null) && ((this.relativeLayout) != null)) {
            this.relativeLayout.removeView(layoutWrapper);
            this.relativeLayout.requestLayout();
            layoutWrapper = null;
        }
    } finally {
        removed[0] = true;
    }
}