@java.lang.Override
public void buildFinished(com.intellij.openapi.project.Project project, java.util.UUID sessionId, boolean isAutomake) {
    if ((!(project.equals(myProject))) || (!isAutomake)) {
        return ;
    }
    console.debug("build finished");
    submitter.submitOpenFilesAuto(TriggerType.COMPILATION);
}