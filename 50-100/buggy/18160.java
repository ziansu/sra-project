public com.github.njakovleva.OutboxPage openSenderOutbox() {
    org.openqa.selenium.WebDriver driver = new org.openqa.selenium.firefox.FirefoxDriver();
    com.github.njakovleva.LoginPage loginPage = new com.github.njakovleva.LoginPage(driver, com.github.njakovleva.SendFromGUIClass.userData.getSenderMailUrl());
    com.github.njakovleva.InboxPage inboxPage = loginPage.loginAs(com.github.njakovleva.SendFromGUIClass.userData.getSenderLogin(), com.github.njakovleva.SendFromGUIClass.userData.getSenderPassword());
    com.github.njakovleva.NewMailPage newMailPage = inboxPage.openComposePage();
    inboxPage = newMailPage.sendMail(com.github.njakovleva.SendFromGUIClass.userData.getReceiver(), com.github.njakovleva.SendFromGUIClass.userData.getSubject(), com.github.njakovleva.SendFromGUIClass.userData.getContent());
    com.github.njakovleva.OutboxPage outboxPage = inboxPage.openOutboxPage();
    return outboxPage;
}