public static com.cwctravel.hudson.plugins.extended_choice_parameter.ExtendedChoiceParameterDefinition getVersionDescr(java.lang.String toolName) {
    com.cloudbees.jenkins.plugins.customtools.CustomTool.DescriptorImpl tools = hudson.tools.ToolInstallation.all().get(CustomTool.DescriptorImpl.class);
    if (tools == null) {
        return com.synopsys.arc.jenkinsci.plugins.customtools.versions.ToolVersionHelper.getDefaultVersionDescr(toolName);
    }
    final com.cloudbees.jenkins.plugins.customtools.CustomTool tool = tools.byName(toolName);
    final com.synopsys.arc.jenkinsci.plugins.customtools.versions.ToolVersionConfig toolVersionConfig = (tool != null) ? tool.getToolVersion() : null;
    return toolVersionConfig != null ? toolVersionConfig.getVersionsListSource() : com.synopsys.arc.jenkinsci.plugins.customtools.versions.ToolVersionHelper.getDefaultVersionDescr(toolName);
}