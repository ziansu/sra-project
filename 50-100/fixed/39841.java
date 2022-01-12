public static void test_337() {
    excute(testcase.Object_TextScroll, testcase.Operation_ClickWait, "日期和时间", "vertical");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "自动确定时区");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "选择时区");
    check(testcase.Object_Text, testcase.Operation_checkExist, "选择时区");
    excute(testcase.Object_Device, testcase.Operation_PressBack);
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "自动确定时区");
}