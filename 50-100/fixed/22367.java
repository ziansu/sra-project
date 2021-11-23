private boolean shouldUpdate() {
    boolean shouldUpdate = true;
    final java.io.File masterFile = new java.io.File(masterFilePath);
    if (masterFile.exists()) {
        try {
            fiftyone.mobile.detection.Dataset dataset = fiftyone.mobile.detection.factories.StreamFactory.create(masterFilePath, false);
            if ((dataset.getName().equals("Lite")) && (new java.util.Date().before(dataset.nextUpdate))) {
                shouldUpdate = false;
            }
        } catch (java.io.IOException ex) {
        }
    }
    return shouldUpdate;
}