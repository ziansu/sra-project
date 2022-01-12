public static void test_036() {
    framework.common.GalleryCommon.deleteMoreGallery();
    framework.common.GalleryCommon.morePicture();
    framework.common.GalleryCommon.clickGallery();
    check(testcase.Object_Text, testcase.Operation_WaitForExists, "相机", "10000");
    framework.common.GalleryCommon.clickGallery();
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "详细信息");
    check(testcase.Object_Text, testcase.Operation_checkExist, "浏览模式: 0");
    check(testcase.Object_Text, testcase.Operation_checkExist, "关闭");
}