@org.testng.annotations.AfterMethod(alwaysRun = true)
public void afterMethod() {
    secondFederate.quickResign();
    defaultFederate.quickResign();
    defaultFederate.quickDestroy();
}