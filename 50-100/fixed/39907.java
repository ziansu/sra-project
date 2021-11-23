public static void test_040() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException, java.io.IOException {
    framework.common.MessageCommon.switchView("文件夹视图");
    framework.common.MessageCommon.Menuoption("收件箱");
    framework.common.MessageCommon.longclickmessage("呼叫");
    framework.common.CallCommon.makeCall();
    check(testcase.Object_ResourceId, testcase.Operation_checkExist, "com.android.dialer:id/floating_end_call_action_button");
    framework.common.CallCommon.endCall();
}