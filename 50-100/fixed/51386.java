public static void test_234() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException {
    excute(testcase.Object_TextScroll, testcase.Operation_ClickWait, "应用", "vertical");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.settings:id/advanced");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "在其他应用的上层显示");
    excute(testcase.Object_Device, testcase.Operation_PressMenu);
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "重置应用偏好设置");
    check(testcase.Object_Text, testcase.Operation_checkExist, "要重置应用偏好设置吗？");
}