private java.io.File createFileName(java.lang.String datasetId, java.lang.String qualifier) {
    if ((taskConfigPrerendering) == null) {
        taskConfigPrerendering = readJobConfig(configFile);
    }
    java.nio.file.Path outputDirectory = getOutputFolder();
    java.lang.String filename = (qualifier != null) ? ((datasetId + "_") + qualifier) + ".png" : datasetId + ".png";
    return outputDirectory.resolve(filename).toFile();
}