public void searchForContact(java.lang.String name) throws java.lang.Exception {
    com.android.uiautomator.core.UiObject search = getUiObjectByText("Search", "android.widget.EditText");
    search.setText(name);
    com.android.uiautomator.core.UiObject peopleItem = new com.android.uiautomator.core.UiObject(new com.android.uiautomator.core.UiSelector().resourceId("com.skype.raider:id/list").childSelector(new com.android.uiautomator.core.UiSelector().index(0).clickable(true)));
    peopleItem.waitForExists(timeout);
    peopleItem.click();
    com.android.uiautomator.core.UiObject confirm = new com.android.uiautomator.core.UiObject(new com.android.uiautomator.core.UiSelector().resourceId("com.skype.raider:id/fab"));
    confirm.click();
}