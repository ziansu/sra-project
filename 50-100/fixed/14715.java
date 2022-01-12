public static void test_338() {
    excute(testcase.Object_TextScroll, testcase.Operation_ClickWait, "日期和时间", "vertical");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "自动确定时区");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "选择时区");
    excute(testcase.Object_TextScroll, testcase.Operation_ClickWait, "香港", "vertical");
    check(testcase.Object_Text, testcase.Operation_checkExist, "GMT+08:00 香港标准时间");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "自动确定时区");
}