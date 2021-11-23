public static void test_066() {
    framework.common.GalleryCommon.deleteMoreGallery();
    framework.common.GalleryCommon.clickGallery();
    check(testcase.Object_Description, testcase.Operation_WaitForExists, "更多选项", "10000");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "编辑");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "黑白");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "重置");
    excute(testcase.Object_Device, testcase.Operation_PressBack);
    check(testcase.Object_Text, testcase.Operation_checkNoExist, "保存并退出");
}