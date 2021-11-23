public void test_042() {
    framework.common.ClockCommon.switchMode("秒表");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "开始");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "停止");
    check(testcase.Object_Description, testcase.Operation_checkExist, "开始");
    check(testcase.Object_Description, testcase.Operation_checkExist, "分享");
}