public static java.util.List<java.lang.String> getSourceRootPathList(com.intellij.openapi.project.Project project, com.intellij.openapi.actionSystem.AnActionEvent event) {
    java.util.List<java.lang.String> sourceRoots = com.google.common.collect.Lists.newArrayList();
    java.lang.String projectPath = org.apache.velocity.util.StringUtils.normalizePath(project.getBasePath());
    for (com.intellij.openapi.vfs.VirtualFile virtualFile : com.njnu.kai.plugin.util.VirtualFileUtils.getModuleRootManager(event).getSourceRoots(false)) {
        sourceRoots.add(org.apache.velocity.util.StringUtils.normalizePath(virtualFile.getPath()).replace(projectPath, ""));
    }
    return sourceRoots;
}