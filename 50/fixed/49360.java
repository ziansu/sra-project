@java.lang.Override
public void run() {
    execute(datasetConfig.getPartFileAbsolutePaths().get(count), datasetConfig.getConfiguration().getString("mappingFile"), datasetConfig.getConfiguration().getString("outputFile"));
}