public org.openqa.selenium.WebDriver selectDriver(int index) {
    try {
        org.openqa.selenium.WebDriver wd = drivers.get((index - 1));
        currentDriverIndex = index;
        setDriver(wd);
        java.lang.System.out.println((("Driver index " + index) + " selected"));
        return driver;
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException((("Driver index of " + index) + " is invalid"));
    }
}