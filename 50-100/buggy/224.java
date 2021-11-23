public void testAskForReview() {
    com.gdf.managedBean.ListTendererBeanTest.driver.get(com.gdf.managedBean.ListTendererBeanTest.baseUrl);
    org.openqa.selenium.WebElement askButton = com.gdf.managedBean.ListTendererBeanTest.driver.findElement(askReviewBtnXpathExp);
    org.openqa.selenium.WebElement sendButton = com.gdf.managedBean.ListTendererBeanTest.driver.findElement(sendReviewBtnXpathExp);
    askButton.click();
    sendButton.click();
    org.openqa.selenium.WebElement growlTitle = com.gdf.managedBean.ListTendererBeanTest.driver.findElement(org.openqa.selenium.By.className("ui-growl-title"));
    org.junit.Assert.assertEquals(growlTitle.getText(), "Demande d'avis envoyée !");
}