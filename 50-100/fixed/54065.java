public static void test_057() {
    framework.common.GalleryCommon.deleteMoreGallery();
    framework.common.GalleryCommon.morePicture();
    framework.common.GalleryCommon.clickGallery();
    excute(testcase.Object_ResourceId, testcase.Operation_WaitForExists, "android:id/text2", "10000");
    framework.common.GalleryCommon.clickGallery();
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "打印");
    check(testcase.Object_Text, testcase.Operation_checkExist, "保存为 PDF");
}