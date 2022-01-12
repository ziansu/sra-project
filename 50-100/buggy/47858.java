public java.lang.String getCurrentSettingFor(java.lang.String settingTitle) {
    java.lang.System.out.println(("Setting Title queried :" + settingTitle));
    for (org.openqa.selenium.WebElement elem : allSettings) {
        if (elem.findElement(org.openqa.selenium.By.id("android:id/title")).getText().equals(settingTitle)) {
            java.lang.String settingValue = elem.findElement(org.openqa.selenium.By.id("android:id/summary")).getText();
            java.lang.System.out.println(((("Setting Title queried :" + settingTitle) + "setting value found is:") + settingValue));
            return settingValue;
        }
    }
    return "";
}