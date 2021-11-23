public void printOpenWindows() {
    java.util.ArrayList<java.lang.String> tabs = new java.util.ArrayList<java.lang.String>(driver.getWindowHandles());
    for (java.lang.String handle : tabs) {
        driver.switchTo().window(handle);
        java.lang.System.out.println(("New Window Handle: " + handle));
    }
}