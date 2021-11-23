@org.jetbrains.annotations.Nullable
private com.intellij.openapi.projectRoots.Sdk getCurrentProjectJdk() {
    com.intellij.openapi.roots.ui.configuration.projectRoot.ProjectSdksModel projectJdksModel = new com.intellij.openapi.roots.ui.configuration.projectRoot.ProjectSdksModel();
    projectJdksModel.reset(commonModel.getProject());
    return projectJdksModel.getProjectSdk();
}