public static void test_068() {
    framework.common.GalleryCommon.deleteMoreGallery();
    framework.common.GalleryCommon.clickGallery();
    excute(testcase.Object_Description, testcase.Operation_WaitForExists, "更多选项", "10000");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "编辑");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "黑白");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "显示已应用的效果");
    check(testcase.Object_ResourceId, testcase.Operation_checkExist, "com.android.gallery3d:id/toggleVersionsPanel");
}