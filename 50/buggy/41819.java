public boolean rebuild(com.intellij.openapi.project.Project project) {
    return (cleanAll(project)) && (executeTask(project));
}