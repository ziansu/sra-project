private MsBuildBuilder.DescriptorImpl getDescriptor() {
    jenkins.model.Jenkins jenkins = jenkins.model.Jenkins.getInstance();
    if ((jenkins != null) && ((jenkins.getDescriptorByType(MsBuildBuilder.DescriptorImpl.class)) != null)) {
        return jenkins.getDescriptorByType(MsBuildBuilder.DescriptorImpl.class);
    }else {
        throw new java.lang.NullPointerException((jenkins == null ? "Jenkins instance is null" : "MsBuildBuilder.DescriptorImpl is null"));
    }
}