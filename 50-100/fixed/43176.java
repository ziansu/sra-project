@java.lang.Override
public synchronized void computeScroll() {
    if (scroller.computeScrollOffset()) {
        if (isAllowedToScrollBack) {
            if ((heightOfHeader) < (headerLayoutParams.height)) {
                resizeHeightOfHeader(scroller.getCurrY());
            }
        }
        super.computeScroll();
    }
}