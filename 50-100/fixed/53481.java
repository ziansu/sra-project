static void initAliases() {
    jenkins.model.Jenkins jenkins = jenkins.model.Jenkins.getInstance();
    if (jenkins == null) {
        hudson.plugins.copyartifact.BuildSelectorParameter.LOGGER.severe("Called for initialization but Jenkins instance no longer available.");
        return ;
    }
    for (hudson.model.Descriptor<hudson.plugins.copyartifact.BuildSelector> d : jenkins.getDescriptorByType(hudson.plugins.copyartifact.BuildSelectorParameter.DescriptorImpl.class).getBuildSelectors())
        hudson.plugins.copyartifact.BuildSelectorParameter.XSTREAM.alias(d.clazz.getSimpleName(), d.clazz);
    
}