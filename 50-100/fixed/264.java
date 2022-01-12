public static void getBrowserInfo(org.openqa.selenium.WebDriver instance, java.lang.String description) {
    if ((core.Platform.getBrowser(instance)) != null) {
        java.lang.String browserInfo = ((core.Platform.getBrowserName(instance)) + " ") + (core.Platform.getBrowserVersion(instance));
        java.lang.System.out.println(((description + ":	") + (browserInfo.replace("  ", " "))));
    }
}