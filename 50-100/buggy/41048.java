public static void test_000() throws com.android.uiautomator.core.UiObjectNotFoundException {
    framework.common.DeviceCommon.enterApp(testcase.Devices_Desc_Setting);
    excute(testcase.Object_TextScroll, testcase.Operation_ClickWait, "应用", "vertical");
    excute(testcase.Object_TextScroll, testcase.Operation_ClickWait, "图库", "vertical");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "存储空间");
    check(testcase.Object_ResIdText, testcase.Operation_ClickWait, "com.android.settings:id/button", "清除数据");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "确定");
}