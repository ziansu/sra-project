protected void abort(java.lang.Throwable failure) {
    notifyFailure(this, failure);
    terminate();
}