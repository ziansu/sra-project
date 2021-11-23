@org.testng.annotations.AfterMethod(alwaysRun = true)
public void afterMethod() {
    secondFederate.quickResign();
    secondFederate.quickDisconnect();
    defaultFederate.quickResign();
    defaultFederate.quickDestroy();
}