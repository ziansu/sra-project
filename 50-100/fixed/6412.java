public static void test_033() {
    try {
        framework.common.MessageCommon.switchView("文件夹视图");
        framework.common.MessageCommon.Menuoption("收件箱");
        framework.common.MessageCommon.switchView("显示选项");
        java.lang.String SIM1 = ((java.lang.String) (excute(testcase.Object_ResIdInstance, testcase.Operation_GetText, "android:id/text1", "1")));
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "android:id/text1", "1");
        check(testcase.Object_Text, testcase.Operation_checkExist, SIM1);
    } finally {
        framework.common.MessageCommon.switchView("显示选项");
        excute(testcase.Object_Text, testcase.Operation_ClickWait, "显示全部信息");
    }
}