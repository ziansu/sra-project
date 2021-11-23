@java.lang.Override
public void run() {
    addFileToLibrary(destinationFile);
    if ((org.docear.plugin.services.ServiceController.getFeature(org.docear.plugin.services.features.documentretrieval.recommendations.RecommendationsController.class)) != null) {
        org.docear.plugin.services.ServiceController.getFeature(org.docear.plugin.services.features.documentretrieval.recommendations.RecommendationsController.class).refreshDownloadsFolder();
    }
}