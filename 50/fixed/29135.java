private void start() {
    java.io.File inputFolder = new java.io.File(configuration.getProperty(hotresizer.HotResizer.PROP_INPUT_FOLDER));
    java.io.File outputFolder = new java.io.File(configuration.getProperty(hotresizer.HotResizer.PROP_OUTPUT_FOLDER));
    new hotresizer.ImageFileProcessor(inputFolder, outputFolder, configuration).processFolder();
}