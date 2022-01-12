public static void test_030() {
    framework.common.GalleryCommon.deleteMoreGallery();
    framework.common.GalleryCommon.clickGallery();
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "删除");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "取消");
    check(testcase.Object_Text, testcase.Operation_checkNoExist, "要删除所选内容吗？");
}