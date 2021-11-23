public static void test_012() {
    framework.common.GalleryCommon.deleteMoreGallery();
    framework.common.GalleryCommon.morePicture();
    framework.common.GalleryCommon.clickGroup();
    excute(testcase.Object_ResourceId, testcase.Operation_WaitForExists, "android:id/image", "30000");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "android:id/image");
    check(testcase.Object_Text, testcase.Operation_checkExist, "信息");
    check(testcase.Object_Text, testcase.Operation_checkExist, "电子邮件");
    check(testcase.Object_Text, testcase.Operation_checkExist, "蓝牙");
}