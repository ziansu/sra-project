public static java.lang.String describeMatcherAsDisplay(android.support.test.uiautomator.UiObject2 uiObject) {
    java.lang.String display = edu.colorado.plv.chimp.components.ActivityManager.getResEntryName(uiObject.getResourceName());
    if (display == null)
        "Content Desc: ".concat(uiObject.getContentDescription());
    
    if (display == null)
        display = "Text: ".concat(uiObject.getText());
    
    return display;
}