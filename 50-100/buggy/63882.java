@javax.annotation.Nonnull
public static java.util.List<com.cloudbees.jenkins.plugins.customtools.CustomTool> getAllVersionedTools() {
    com.cloudbees.jenkins.plugins.customtools.CustomTool.DescriptorImpl tools = hudson.tools.ToolInstallation.all().get(CustomTool.DescriptorImpl.class);
    java.util.List<com.cloudbees.jenkins.plugins.customtools.CustomTool> res = new java.util.LinkedList<com.cloudbees.jenkins.plugins.customtools.CustomTool>();
    for (com.cloudbees.jenkins.plugins.customtools.CustomTool tool : tools.getInstallations()) {
        if (tool.hasVersions()) {
            res.add(tool);
        }
    }
    return res;
}