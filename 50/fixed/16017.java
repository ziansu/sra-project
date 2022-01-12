@javax.annotation.CheckForNull
public final com.cloudbees.jenkins.plugins.customtools.CustomTool getTool() {
    com.cloudbees.jenkins.plugins.customtools.CustomTool.DescriptorImpl tool = hudson.tools.ToolInstallation.all().get(CustomTool.DescriptorImpl.class);
    return tool == null ? null : tool.byName(toolName);
}