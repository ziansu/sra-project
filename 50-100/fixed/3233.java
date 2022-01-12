private java.lang.String toDependendeeProjectRelativePath(java.io.File file) {
    for (final java.io.File projectFile : this.projectDependencies) {
        if (org.jerkar.tool.builtins.eclipse.JkUtilsFile.isAncestor(projectFile, file)) {
            final java.lang.String relativePath = org.jerkar.tool.builtins.eclipse.JkUtilsFile.getRelativePath(projectFile, file);
            final org.jerkar.tool.builtins.eclipse.Project project = org.jerkar.tool.builtins.eclipse.Project.of(new java.io.File(projectFile, ".project"));
            return (("/" + (project.name)) + "/") + relativePath;
        }
    }
    return null;
}