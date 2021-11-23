public static void test_028() {
    framework.common.VideoPlayerCommon.comeToVideoScreen();
    excute(testcase.Object_ResourceId, testcase.Operation_WaitForExists, "android:id/action_bar_title", "5000");
    framework.common.VideoPlayerCommon.shareType("信息");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "新消息");
    excute(testcase.Object_Text, testcase.Operation_WaitForExists, "收件人", "5000");
    check(testcase.Object_Text, testcase.Operation_checkExist, "收件人");
}