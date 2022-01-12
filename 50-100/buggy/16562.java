public org.fluentlenium.core.action.WindowAction switchToLast(java.lang.String windowHandleToExclude) {
    java.util.Set<java.lang.String> windowHandles = driver.getWindowHandles();
    if ((windowHandles.size()) > 1) {
        windowHandles.remove(windowHandleToExclude);
    }
    driver.switchTo().window(com.google.common.collect.Iterables.getLast(driver.getWindowHandles()));
    return this;
}