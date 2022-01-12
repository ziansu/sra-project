public void test_032() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException {
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "SIM 卡");
    framework.common.SettingCommon.editSIMName("SIM 卡插槽 1");
    excute(testcase.Object_ResourceId, testcase.Operation_SetText, "com.android.settings:id/sim_name", "SIM1");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "确定");
    check(testcase.Object_Text, testcase.Operation_checkExist, "SIM1");
}