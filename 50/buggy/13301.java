public void release() {
    if ((billingProcessor) != null) {
        return ;
    }
    billingProcessor.release();
}