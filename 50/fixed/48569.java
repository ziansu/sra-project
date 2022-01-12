public static void test_044() throws com.android.uiautomator.core.UiObjectNotFoundException {
    try {
        framework.common.PhoneCommon.Makecall("10086", 1);
        check(testcase.Object_ResourceId, testcase.Operation_checkExist, "com.android.dialer:id/floating_end_call_action_button");
    } finally {
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/floating_end_call_action_button");
    }
}