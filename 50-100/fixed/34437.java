public void run(com.intellij.openapi.progress.ProgressIndicator indicator) {
    try {
        generateFiles(generationModel, packageName, directory);
    } catch (com.robohorse.robopojogenerator.errors.RoboPluginException e) {
        messageService.onPluginExceptionHandled(e);
    }
    messageService.showSuccessMessage();
    virtualFolder.refresh(true, true);
    window.setVisible(false);
}