private void runOrPostpone(com.intellij.openapi.progress.Task task) {
    if (!(com.intellij.openapi.application.ex.ApplicationManagerEx.getApplicationEx().isLoaded())) {
        assert jetbrains.mps.ide.ThreadUtils.isInEDT();
        task.run(new com.intellij.openapi.progress.EmptyProgressIndicator());
    }else {
        com.intellij.openapi.application.ApplicationManager.getApplication().invokeLater(() -> {
            com.intellij.openapi.progress.ProgressManager.getInstance().run(task);
        }, com.intellij.openapi.application.ModalityState.defaultModalityState());
    }
}