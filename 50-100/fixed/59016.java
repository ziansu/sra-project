public static void test_145() {
    excute(testcase.Object_ResIdText, testcase.Operation_ClickWait, "com.android.music:id/albumtab", "专辑");
    excute(testcase.Object_ResIdInstance, testcase.Operation_ClickWait, "com.android.music:id/line1", "0");
    java.lang.String music = ((java.lang.String) (excute(testcase.Object_ResIdInstance, testcase.Operation_GetText, "com.android.music:id/line1", "0")));
    excute(testcase.Object_ResIdInstance, testcase.Operation_LongClick, "com.android.music:id/line1", "0");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "删除");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "确定");
    check(testcase.Object_Text, testcase.Operation_checkNoExist, music);
}