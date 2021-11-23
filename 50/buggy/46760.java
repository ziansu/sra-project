public static void test_061() throws com.android.uiautomator.core.UiObjectNotFoundException {
    framework.common.PhoneCommon.Makecall("10086", 1);
    check(testcase.Object_ResourceId, testcase.Operation_checkExist, "com.android.dialer:id/name");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/floating_end_call_action_button");
}