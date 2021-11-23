public void test_019() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException {
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.settings:id/title", "WLAN");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "高级");
    check(testcase.Object_Text, testcase.Operation_checkExist, "高级WLAN");
}