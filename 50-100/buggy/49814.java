public void test_041() {
    framework.common.ClockCommon.switchMode("秒表");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "开始");
    check(testcase.Object_ResIdDesc, testcase.Operation_checkExist, "com.android.deskclock:id/right_button", "停止");
    check(testcase.Object_ResIdDesc, testcase.Operation_checkExist, "com.android.deskclock:id/fab", "停止");
    check(testcase.Object_ResIdDesc, testcase.Operation_checkExist, "com.android.deskclock:id/left_button", "一圈");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "停止");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.deskclock:id/left_button");
}