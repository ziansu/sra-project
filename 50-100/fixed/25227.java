public static void test_055() {
    framework.common.GalleryCommon.deleteMoreGallery();
    framework.common.GalleryCommon.morePicture();
    framework.common.GalleryCommon.clickGallery();
    excute(testcase.Object_ResourceId, testcase.Operation_WaitForExists, "android:id/text2", "10000");
    framework.common.GalleryCommon.clickGallery();
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "剪裁");
    check(testcase.Object_ResourceId, testcase.Operation_checkExist, "com.android.gallery3d:id/cropView");
}