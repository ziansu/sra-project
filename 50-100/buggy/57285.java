public java.util.List<hudson.tools.ToolDescriptor<? extends hudson.plugins.git.GitTool>> getApplicableDesccriptors() {
    java.util.List<hudson.tools.ToolDescriptor<? extends hudson.plugins.git.GitTool>> r = new java.util.ArrayList<>();
    jenkins.model.Jenkins jenkinsInstance = jenkins.model.Jenkins.getInstance();
    if (jenkinsInstance == null) {
        return r;
    }
    for (hudson.tools.ToolDescriptor td : jenkinsInstance.<hudson.tools.ToolInstallation, hudson.tools.ToolDescriptor<?>>getDescriptorList(hudson.tools.ToolInstallation.class)) {
        if (hudson.plugins.git.GitTool.class.isAssignableFrom(td.clazz))
            r.add(td);
        
    }
    return r;
}