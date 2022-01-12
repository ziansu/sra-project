public static void test_022() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException {
    framework.common.GalleryCommon.deleteMoreGallery();
    framework.common.GalleryCommon.morePicture();
    framework.common.GalleryCommon.clickGallery();
    check(testcase.Object_ResourceId, testcase.Operation_WaitForExists, "android:id/text2", "10000");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "android:id/text2");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "幻灯片视图");
    java.lang.String view = ((java.lang.String) (excute(testcase.Object_ResourceId, testcase.Operation_GetText, "android:id/text2")));
    junit.framework.Assert.assertEquals("幻灯片视图", view);
}