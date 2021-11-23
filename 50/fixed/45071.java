public synchronized boolean isLoginFailureMessageVisible() {
    return failureMessage.getCssValue("visibility").equals("visible");
}