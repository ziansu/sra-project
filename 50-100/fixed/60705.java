public static void test_047() throws com.android.uiautomator.core.UiObjectNotFoundException {
    framework.common.CameraCommon.switchMode("相机");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.camera2:id/three_dots");
    framework.common.CameraCommon.switchFrontBackCamera("后置摄像头");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.camera2:id/btn_beauty_button");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.camera2:id/shutter_button");
    excute(testcase.Object_ResourceId, testcase.Operation_WaitForExists, "com.android.camera2:id/rounded_thumbnail_view", "10000");
    check(testcase.Object_ResourceId, testcase.Operation_checkExist, "com.android.camera2:id/rounded_thumbnail_view");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.camera2:id/btn_beauty_button");
}