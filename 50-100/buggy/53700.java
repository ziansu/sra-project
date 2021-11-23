public static void test_045() {
    framework.common.GalleryCommon.deleteMoreGallery();
    framework.common.GalleryCommon.clickGallery();
    check(testcase.Object_ResourceId, testcase.Operation_WaitForExists, "android:id/image", "20000");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "android:id/image");
    if (!((java.lang.Boolean) (excute(testcase.Object_Text, testcase.Operation_Exists, "信息")))) {
        excute(testcase.Object_Device, testcase.Operation_PressBack);
        excute(testcase.Object_ResIdIndex, testcase.Operation_ClickWait, "android:id/default_activity_button", "1");
    }else {
        excute(testcase.Object_Text, testcase.Operation_ClickWait, "信息");
    }
    check(testcase.Object_ResourceId, testcase.Operation_checkExist, "android:id/list");
}