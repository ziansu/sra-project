public void checkRegion(com.applitools.eyes.selenium.By selector, java.lang.String tag, boolean stitchContent) {
    this.stitchContent = stitchContent;
    if (stitchContent) {
        checkElement(selector, tag);
    }else {
        checkRegion(selector, tag);
    }
    this.stitchContent = false;
}