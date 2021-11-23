public void test_037() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException {
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "SIM 卡");
    framework.common.SettingCommon.editSIMName("SIM 卡插槽 2");
    excute(testcase.Object_ResourceId, testcase.Operation_SetText, "com.android.settings:id/sim_name", "SIM2");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "确定");
    check(testcase.Object_ResIdText, testcase.Operation_checkExist, "com.android.settings:id/sim_name", "SIM2");
}