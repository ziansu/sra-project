public static void test_236() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException {
    excute(testcase.Object_TextScroll, testcase.Operation_ClickWait, "应用", "vertical");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.settings:id/advanced");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "修改系统设置");
    excute(testcase.Object_TextScroll, testcase.Operation_ClickWait, "电话", "vertical");
    check(testcase.Object_Text, testcase.Operation_checkExist, "修改系统设置");
}