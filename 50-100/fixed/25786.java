public com.intellij.openapi.project.Project loadProject(java.io.File projectFile) {
    com.intellij.openapi.project.Project project;
    try {
        java.lang.Class<?> cls = java.lang.Class.forName("jetbrains.mps.TestMain");
        java.lang.reflect.Method meth = cls.getMethod("loadProject", java.io.File.class);
        project = ((com.intellij.openapi.project.Project) (meth.invoke(null, projectFile)));
    } catch (java.lang.Exception ex) {
        throw new java.lang.RuntimeException(ex);
    }
    return project;
}