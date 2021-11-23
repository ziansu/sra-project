public static void test_016() {
    framework.common.GalleryCommon.deleteMoreGallery();
    framework.common.GalleryCommon.morePicture();
    framework.common.GalleryCommon.clickGroup();
    check(testcase.Object_Description, testcase.Operation_WaitForExists, "更多选项", "10000");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "删除");
    check(testcase.Object_ResourceId, testcase.Operation_checkExist, "android:id/content");
}