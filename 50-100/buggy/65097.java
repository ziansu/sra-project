@org.junit.Test
@org.junit.experimental.categories.Category(value = com.example.zhengjin.funsettingsuitest.testcategory.CategoryImageSoundConfigsTests.class)
public void test27TitleOfResetAllToDefaultOnImageParams() {
    this.openImageParamsPageFromImageAndSound();
    mMessage = "Verify the reset all to default setting item is enabled on image params.";
    android.support.test.uiautomator.UiObject2 resetItem = mDevice.findObject(mFunUiObjects.getResetToDefaultSettingItemOfImageParamsSelector());
    junit.framework.Assert.assertTrue(com.example.zhengjin.funsettingsuitest.testutils.TestHelper.waitForUiObjectEnabled(resetItem));
    mMessage = "Verify the title of reset all to default setting item.";
    android.support.test.uiautomator.UiObject2 title = resetItem.findObject(mFunUiObjects.getTitleOfResetToDefaultSettingItemSelector());
    junit.framework.Assert.assertEquals(IMAGE_PARAMS_SETTINGS_TITLE_ARR[5], title.getText());
}