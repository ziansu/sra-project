private void takeScreenshotFor(java.lang.String logLine) {
    com.android.ddmlib.RawImage rawImage;
    try {
        rawImage = device.getScreenshot();
    } catch (java.lang.Exception e) {
        return ;
    }
    if (rawImage == null) {
        return ;
    }
    java.util.Map<java.lang.String, java.lang.String> keyValueMap = keyValueMapFor(logLine);
    java.awt.image.BufferedImage image = com.github.rtyley.android.screenshot.paparazzo.OnDemandScreenshotService.bufferedImageFrom(rawImage);
    for (com.github.rtyley.android.screenshot.paparazzo.processors.ScreenshotProcessor screenshotProcessor : processors) {
        screenshotProcessor.process(image, keyValueMap);
    }
}