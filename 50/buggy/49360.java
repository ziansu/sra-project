@java.lang.Override
public void run() {
    execute(datasetConfig.getPartFileAbsolutePaths().get(i), datasetConfig.getConfiguration().getString("mappingFile"), datasetConfig.getConfiguration().getString("outputFile"));
}