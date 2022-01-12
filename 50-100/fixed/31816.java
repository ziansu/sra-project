public void exportFeaturesByProjects() {
    java.lang.String fileExtension = Configuration.DIGITAL_DATA_FILE_EXTENSION;
    java.util.List<java.io.File> inputFiles = edu.lu.uni.util.FileHelper.getAllFiles(Configuration.DATA_EXTRACTED_FEATURE, fileExtension);
    java.util.List<java.io.File> methodInfoFiles = edu.lu.uni.util.FileHelper.getAllFilesInCurrentDiectory(Configuration.ENCODED_METHOD_BODY_FILE_PATH, Configuration.STRING_DATA_FILE_EXTENSION);
    java.lang.String outputPath = Configuration.DATA_EXTRACTED_FEATURE_BY_PROJECTS;
    edu.lu.uni.util.FileHelper.deleteDirectory(outputPath);
    for (java.io.File inputFile : inputFiles) {
        edu.lu.uni.feature.exporter.FeatureExporter exporter = new edu.lu.uni.feature.exporter.FeatureExporter(inputFile, methodInfoFiles, outputPath, Configuration.STRING_DATA_FILE_EXTENSION);
        exporter.exportFeatureByProjects();
        java.lang.System.out.println(inputFile.getName());
    }
}