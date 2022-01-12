public static void test_021() {
    framework.common.GalleryCommon.deleteMoreGallery();
    framework.common.GalleryCommon.morePicture();
    framework.common.GalleryCommon.clickGallery();
    check(testcase.Object_ResourceId, testcase.Operation_WaitForExists, "android:id/text2", "10000");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "android:id/text2");
    check(testcase.Object_Text, testcase.Operation_checkExist, "网格视图");
    check(testcase.Object_Text, testcase.Operation_checkExist, "幻灯片视图");
}