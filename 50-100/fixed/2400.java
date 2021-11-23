@java.lang.Override
public void run(@org.jetbrains.annotations.NotNull
com.intellij.openapi.progress.ProgressIndicator indicator) {
    git4idea.commands.GitCommandResult result = myLPFlow.hotfix(repo, commitMessage, indicator, errorLineHandler);
    if (result.success()) {
        java.lang.String finishedFeatureMessage = "Hotfix success";
        lpflow.ui.NotifyUtil.notifySuccess(myProject, finishedFeatureMessage, finishedFeatureMessage);
    }else
        if (errorLineHandler.hasMergeError) {
        }else {
            lpflow.ui.NotifyUtil.notifyError(myProject, "Error", "Please have a look at the Version Control console for more details");
        }
    
    repo.update();
}