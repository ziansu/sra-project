public void run(com.intellij.openapi.progress.ProgressIndicator indicator) {
    try {
        generateFiles(generationModel, packageName, directory);
        virtualFolder.refresh(false, true);
        messageService.showSuccessMessage();
        window.setVisible(false);
    } catch (com.robohorse.robopojogenerator.errors.RoboPluginException e) {
        messageService.onPluginExceptionHandled(e);
    }
}