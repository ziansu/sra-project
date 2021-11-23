public hudson.util.FormValidation doCheckWorkspaceGlob(@org.kohsuke.stapler.AncestorInPath
hudson.model.AbstractProject project, @org.kohsuke.stapler.QueryParameter
java.lang.String value) throws java.io.IOException {
    if (project != null) {
        return hudson.FilePath.validateFileMask(project.getSomeWorkspace(), value);
    }else {
        return null;
    }
}