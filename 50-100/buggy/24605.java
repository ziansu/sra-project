public void test_016() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException {
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.settings:id/title", "WLAN");
    if (((java.lang.Boolean) (excute(testcase.Object_Text, testcase.Operation_Exists, "关闭")))) {
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.settings:id/switch_widget");
    }else {
        excute(testcase.Object_ResourceId, testcase.Operation_Exists, "com.android.settings:id/switch_text", "开启");
    }
    check(testcase.Object_Text, testcase.Operation_checkExist, "Testteam");
    check(testcase.Object_Text, testcase.Operation_checkExist, "TSTest23");
    check(testcase.Object_Text, testcase.Operation_checkExist, "ThunderSoft23");
}