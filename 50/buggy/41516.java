@java.lang.Override
public void run() {
    addFileToLibrary(destinationFile);
    org.docear.plugin.services.ServiceController.getFeature(org.docear.plugin.services.features.documentretrieval.recommendations.RecommendationsController.class).refreshDownloadsFolder();
}