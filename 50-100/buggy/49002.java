public void test_057() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException {
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "流量使用情况");
    excute(testcase.Object_Device, testcase.Operation_PressMenu);
    if (((java.lang.Boolean) (excute(testcase.Object_Text, testcase.Operation_Exists, "隐藏WLAN流量")))) {
        excute(testcase.Object_Text, testcase.Operation_ClickWait, "隐藏WLAN流量");
        excute(testcase.Object_Device, testcase.Operation_PressMenu);
    }
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "显示WLAN流量");
    check(testcase.Object_Text, testcase.Operation_checkExist, "WLAN");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "隐藏WLAN流量");
}