@org.jetbrains.annotations.Nullable
public static SingleFileExecutionConfig getInstance(com.intellij.openapi.project.Project project) {
    SingleFileExecutionConfig sfec = com.intellij.openapi.components.ServiceManager.getService(project, SingleFileExecutionConfig.class);
    sfec.init();
    return sfec;
}