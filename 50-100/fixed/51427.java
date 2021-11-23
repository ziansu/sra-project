private void runOrPostpone(com.intellij.openapi.progress.Task task) {
    if ((!(com.intellij.openapi.application.ex.ApplicationManagerEx.getApplicationEx().isLoaded())) && (jetbrains.mps.ide.ThreadUtils.isInEDT())) {
        task.run(new com.intellij.openapi.progress.EmptyProgressIndicator());
    }else {
        invokeLater(task);
    }
}