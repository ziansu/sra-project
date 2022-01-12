public static void test_054() throws com.android.uiautomator.core.UiObjectNotFoundException {
    framework.common.PhoneCommon.Makecall("10086", 1);
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/overflowButton");
    excute(testcase.Object_Text, testcase.Operation_WaitForExists, "录音", "10000");
    check(testcase.Object_Text, testcase.Operation_checkExist, "添加通话");
    check(testcase.Object_Text, testcase.Operation_checkExist, "录音");
    excute(testcase.Object_Device, testcase.Operation_PressBack);
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/floating_end_call_action_button");
}