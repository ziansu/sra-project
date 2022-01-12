private com.wikia.webdriver.pageobjectsfactory.pageobject.visualeditor.Point getBlockTransclusionLocation(int index) {
    com.wikia.webdriver.pageobjectsfactory.pageobject.visualeditor.JavascriptExecutor js = ((com.wikia.webdriver.pageobjectsfactory.pageobject.visualeditor.JavascriptExecutor) (driver));
    java.lang.Object templateBounding = js.executeScript(VEContent.BOUNDING_SCRIPT, blockTransclusionString, index);
    java.util.Map<java.lang.String, java.lang.String> mapBounding = ((java.util.Map) (templateBounding));
    int tempLeft = java.lang.Integer.parseInt(java.lang.String.valueOf(mapBounding.get("left")));
    int tempTop = java.lang.Integer.parseInt(java.lang.String.valueOf(mapBounding.get("top")));
    return new com.wikia.webdriver.pageobjectsfactory.pageobject.visualeditor.Point(tempLeft, tempTop);
}