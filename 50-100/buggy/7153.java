public static void test_044() {
    framework.common.GalleryCommon.deleteMoreGallery();
    framework.common.GalleryCommon.clickGallery();
    check(testcase.Object_ResourceId, testcase.Operation_WaitForExists, "android:id/image", "20000");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "android:id/image");
    if (!((java.lang.Boolean) (excute(testcase.Object_Text, testcase.Operation_Exists, "蓝牙")))) {
        excute(testcase.Object_Device, testcase.Operation_PressBack);
        excute(testcase.Object_ResIdIndex, testcase.Operation_ClickWait, "android:id/default_activity_button", "1");
    }else {
        excute(testcase.Object_Text, testcase.Operation_ClickWait, "蓝牙");
    }
    check(testcase.Object_Text, testcase.Operation_checkExist, "开启");
}