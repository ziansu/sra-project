public java.lang.Integer choosePosition() {
    int count = manager.driver.findElements(org.openqa.selenium.By.xpath(com.example.fw.GroupHelper.GROUP_XPATH)).size();
    if (count == 1) {
        return 1;
    }else {
        java.util.Random rnd = new java.util.Random();
        return (rnd.nextInt((count - 1))) + 1;
    }
}