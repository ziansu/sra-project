public void test_117() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException, java.io.IOException {
    try {
        framework.common.ClockCommon.changeLanguage("English");
        excute(testcase.Object_Description, testcase.Operation_ClickWait, "Cities");
        excute(testcase.Object_Description, testcase.Operation_ClickWait, "Search");
        excute(testcase.Object_ResourceId, testcase.Operation_SetText, "com.android.deskclock:id/search_src_text", "shanghai");
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.deskclock:id/search_close_btn");
        check(testcase.Object_ResIdText, testcase.Operation_checkNoExist, "com.android.deskclock:id/city_name", "Shanghai");
    } finally {
        framework.common.ClockCommon.changeLanguage("中文 (简体)");
    }
}