@java.lang.Override
public com.intellij.execution.ExecutionResult execute(com.intellij.execution.Executor executor, com.jetbrains.edu.coursecreator.run.ProcessStarter processStarter, com.jetbrains.python.run.CommandLinePatcher... patchers) throws com.intellij.execution.ExecutionException {
    com.jetbrains.edu.coursecreator.CCUtils.updateResources(myRunConfiguration.getProject(), myTask, myTaskDir);
    com.intellij.openapi.application.ApplicationManager.getApplication().runWriteAction(() -> com.jetbrains.edu.learning.checker.StudyCheckUtils.flushWindows(myTask, myTaskDir));
    return super.execute(executor, patchers);
}