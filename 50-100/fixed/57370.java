final void initEvaluate(final io.launchowl.viewvalidationlibrary.Criteria criteria, final T view) {
    cancelled = false;
    this.criteria = criteria;
    if ((this.thread) != null) {
        this.thread.interrupt();
    }
    this.thread = new java.lang.Thread(() -> evaluate(view));
    this.thread.start();
}