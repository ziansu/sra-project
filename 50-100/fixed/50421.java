public void test_043() {
    framework.common.ClockCommon.switchMode("秒表");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "开始");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.deskclock:id/left_button");
    check(testcase.Object_ResIdText, testcase.Operation_checkExist, "com.android.deskclock:id/lap_number", "# 2");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "停止");
}