public static void loadLocationsAndResourceGrps(com.intellij.openapi.project.Project project) {
    java.util.Map<com.microsoft.azuretools.authmanage.models.SubscriptionDetail, java.util.List<com.microsoft.azure.management.resources.Location>> subscription2Location = com.microsoft.azuretools.utils.AzureModel.getInstance().getSubscriptionToLocationMap();
    com.intellij.openapi.progress.ProgressManager.getInstance().run(new com.intellij.openapi.progress.Task.Modal(project, "Loading Available Locations...", false) {
        @java.lang.Override
        public void run(com.intellij.openapi.progress.ProgressIndicator indicator) {
            try {
                com.microsoft.azuretools.utils.AzureModelController.updateSubscriptionMaps(null);
            } catch (java.lang.Exception ex) {
                com.microsoft.intellij.AzurePlugin.log("Error loading locations", ex);
            }
        }
    });
}