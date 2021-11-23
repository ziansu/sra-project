public static void test_054() {
    framework.common.GalleryCommon.deleteMoreGallery();
    framework.common.GalleryCommon.morePicture();
    framework.common.GalleryCommon.clickGallery();
    check(testcase.Object_ResourceId, testcase.Operation_WaitForExists, "android:id/text2", "10000");
    framework.common.GalleryCommon.clickGallery();
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "向右旋转");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "详细信息");
    check(testcase.Object_Text, testcase.Operation_checkExist, "浏览模式: 90");
}