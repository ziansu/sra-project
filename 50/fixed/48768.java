public static void test_037() {
    framework.common.VideoPlayerCommon.switchMode("网格视图");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "选择条目");
    check(testcase.Object_Text, testcase.Operation_checkExist, "选中了 0 项");
}