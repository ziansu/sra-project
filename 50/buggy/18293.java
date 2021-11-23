@java.lang.Override
public java.util.Collection<org.aperteworkflow.editor.domain.Permission> getPermissions() {
    org.aperteworkflow.editor.stepeditor.user.UserStepEditorWindow.logger.info("getPermissions: ");
    for (org.aperteworkflow.editor.domain.Permission pp : permissions) {
        org.aperteworkflow.editor.stepeditor.user.UserStepEditorWindow.logger.info(pp.toString());
    }
    org.aperteworkflow.editor.stepeditor.user.UserStepEditorWindow.logger.info("getPermissions: finished");
    return permissions;
}