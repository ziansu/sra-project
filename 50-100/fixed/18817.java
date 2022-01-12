public static void test_018() {
    framework.common.GalleryCommon.deleteMoreGallery();
    framework.common.GalleryCommon.morePicture();
    framework.common.GalleryCommon.clickGroup();
    excute(testcase.Object_Description, testcase.Operation_WaitForExists, "更多选项", "10000");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "删除");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "确定");
    check(testcase.Object_Text, testcase.Operation_checkExist, "相机");
}