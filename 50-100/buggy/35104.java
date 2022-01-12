private void processSave() {
    final java.lang.String imageFilename = cyclerService.saveCurrentImage();
    if ((imageFilename == null) || (imageFilename.isEmpty())) {
        Log.error("Image NOT saved: null filename returned!");
    }else {
        Log.info("Image saved: [{}]", cyclerService.saveCurrentImage());
    }
}