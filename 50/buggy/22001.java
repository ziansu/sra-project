@java.lang.Override
public void removePermission(org.aperteworkflow.editor.domain.Permission permission) {
    permissions.remove(permission);
    org.aperteworkflow.editor.stepeditor.user.UserStepEditorWindow.logger.info("removePermission: ");
    for (org.aperteworkflow.editor.domain.Permission pp : permissions) {
        org.aperteworkflow.editor.stepeditor.user.UserStepEditorWindow.logger.info(pp.toString());
    }
    org.aperteworkflow.editor.stepeditor.user.UserStepEditorWindow.logger.info("removePermission: finished");
}