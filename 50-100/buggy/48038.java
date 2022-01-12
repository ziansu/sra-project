public void checkPanelUI(java.lang.String state, java.lang.Boolean first) throws java.lang.Exception {
    if (first)
        swipe_left();
    
    java.io.File light_state = new java.io.File((((projectPath) + "/scr/") + state));
    java.lang.Thread.sleep(10000);
    java.util.List<org.openqa.selenium.WebElement> status = driver.findElements(org.openqa.selenium.By.id("com.qolsys:id/statusButton"));
    checkAllStatus(light_state, status);
}