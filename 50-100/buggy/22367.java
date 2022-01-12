private boolean shouldUpdate() {
    boolean shouldUpdate = true;
    final java.io.File masterFile = new java.io.File(masterFilePath);
    if (masterFile.exists()) {
        try {
            fiftyone.mobile.detection.Dataset dataset = fiftyone.mobile.detection.factories.StreamFactory.create(masterFilePath);
            if (((dataset.getName()) != "Lite") && (new java.util.Date().before(dataset.nextUpdate))) {
                shouldUpdate = false;
            }
        } catch (java.io.IOException ex) {
        }
    }
    return shouldUpdate;
}