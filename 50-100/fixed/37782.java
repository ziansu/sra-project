public static void test_067() {
    framework.common.GalleryCommon.deleteMoreGallery();
    framework.common.GalleryCommon.clickGallery();
    excute(testcase.Object_Description, testcase.Operation_WaitForExists, "更多选项", "10000");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "编辑");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "信息");
    check(testcase.Object_Text, testcase.Operation_checkExist, "EXIF 数据");
}