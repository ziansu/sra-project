protected void goOnline() {
    this.error = null;
    this.retryCount = 0;
    checkSession();
}