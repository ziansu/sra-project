public static void test_057() throws com.android.uiautomator.core.UiObjectNotFoundException {
    try {
        framework.common.PhoneCommon.Makecall("10086", 1);
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/overflowButton");
        excute(testcase.Object_Text, testcase.Operation_WaitForExists, "录音", "10000");
        excute(testcase.Object_Text, testcase.Operation_ClickWait, "录音");
        check(testcase.Object_ResourceId, testcase.Operation_checkExist, "com.android.dialer:id/recordinglabel");
    } finally {
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/floating_end_call_action_button");
    }
}