public static void test_051() throws com.android.uiautomator.core.UiObjectNotFoundException {
    try {
        framework.common.PhoneCommon.Makecall("10086", 1);
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/dialpadButton");
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/one");
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/two");
        check(testcase.Object_Text, testcase.Operation_checkExist, "12");
    } finally {
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/floating_end_call_action_button");
    }
}