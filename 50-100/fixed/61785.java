public static void test_050() throws com.android.uiautomator.core.UiObjectNotFoundException {
    try {
        framework.common.PhoneCommon.Makecall("10086", 1);
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/dialpadButton");
        check(testcase.Object_ResourceId, testcase.Operation_checkExist, "com.android.dialer:id/one");
        check(testcase.Object_ResourceId, testcase.Operation_CheckedTrue, "com.android.dialer:id/dialpadButton");
    } finally {
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/floating_end_call_action_button");
    }
}