public static void test_053() throws com.android.uiautomator.core.UiObjectNotFoundException {
    try {
        framework.common.PhoneCommon.Makecall("10086", 1);
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/holdButton");
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/holdButton");
        check(testcase.Object_ResourceId, testcase.Operation_CheckedFalse, "com.android.dialer:id/holdButton");
    } finally {
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/floating_end_call_action_button");
    }
}