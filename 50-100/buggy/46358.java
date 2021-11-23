public void test_044() {
    framework.common.ClockCommon.switchMode("秒表");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "开始");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.deskclock:id/fab");
    java.lang.String time = ((java.lang.String) (excute(testcase.Object_ResourceId, testcase.Operation_GetDesc, "com.android.deskclock:id/stopwatch_time_text")));
    java.lang.String time1 = ((java.lang.String) (excute(testcase.Object_ResourceId, testcase.Operation_GetDesc, "com.android.deskclock:id/stopwatch_time_text")));
    junit.framework.Assert.assertTrue(time.equals(time1));
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.deskclock:id/left_button");
}