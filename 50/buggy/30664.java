@java.lang.Override
public void addPermission(org.aperteworkflow.editor.domain.Permission permission) {
    permissions.add(permission);
    org.aperteworkflow.editor.stepeditor.user.UserStepEditorWindow.logger.info("addPermission: ");
    for (org.aperteworkflow.editor.domain.Permission pp : permissions) {
        org.aperteworkflow.editor.stepeditor.user.UserStepEditorWindow.logger.info(pp.toString());
    }
    org.aperteworkflow.editor.stepeditor.user.UserStepEditorWindow.logger.info("addPermission: finished");
}