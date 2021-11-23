public static void test_031() {
    framework.common.GalleryCommon.deleteMoreGallery();
    framework.common.GalleryCommon.clickGallery();
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "删除");
    check(testcase.Object_Text, testcase.Operation_checkExist, "要删除所选内容吗？");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "确定");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "选择相册");
    check(testcase.Object_Text, testcase.Operation_checkNoExist, "选中了 0 项");
}