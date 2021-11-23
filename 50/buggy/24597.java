public static void test_059() throws com.android.uiautomator.core.UiObjectNotFoundException {
    framework.common.PhoneCommon.Makecall("10086", 1);
    check(testcase.Object_ResIdContainsText, testcase.Operation_checkExist, "com.android.dialer:id/callStateLabel", "主卡");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/floating_end_call_action_button");
}