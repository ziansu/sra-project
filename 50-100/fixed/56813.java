public hudson.DescriptorExtensionList<hudson.plugins.copyartifact.BuildSelector, hudson.model.Descriptor<hudson.plugins.copyartifact.BuildSelector>> getBuildSelectors() {
    jenkins.model.Jenkins jenkins = jenkins.model.Jenkins.getInstance();
    if (jenkins == null) {
        return hudson.DescriptorExtensionList.createDescriptorList(((jenkins.model.Jenkins) (null)), hudson.plugins.copyartifact.BuildSelector.class);
    }
    return jenkins.<hudson.plugins.copyartifact.BuildSelector, hudson.model.Descriptor<hudson.plugins.copyartifact.BuildSelector>>getDescriptorList(hudson.plugins.copyartifact.BuildSelector.class);
}