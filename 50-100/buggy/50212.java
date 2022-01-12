private void verifyCanInteractWithElement() {
    assertElementNotStale();
    java.lang.Boolean displayed = parent.implicitlyWaitFor(new java.util.concurrent.Callable<java.lang.Boolean>() {
        @java.lang.Override
        public java.lang.Boolean call() throws java.lang.Exception {
            return isDisplayed();
        }
    });
    if ((displayed == null) || (!(displayed.booleanValue()))) {
        throw new org.openqa.selenium.ElementNotVisibleException("You may only interact with visible elements");
    }
    if (!(isEnabled())) {
        throw new org.openqa.selenium.InvalidElementStateException("You may only interact with enabled elements");
    }
}