public static void test_059() {
    framework.common.GalleryCommon.deleteMoreGallery();
    framework.common.GalleryCommon.clickGallery();
    excute(testcase.Object_Description, testcase.Operation_WaitForExists, "更多选项", "10000");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "编辑");
    check(testcase.Object_Text, testcase.Operation_checkExist, "保存");
}