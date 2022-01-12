public void test_016() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException {
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "WLAN");
    if (((java.lang.Boolean) (excute(testcase.Object_Text, testcase.Operation_Exists, "关闭")))) {
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.settings:id/switch_widget");
    }
    check(testcase.Object_Text, testcase.Operation_checkExist, "Testteam");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.settings:id/switch_widget");
}