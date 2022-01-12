public static boolean doit(hudson.FilePath workspace, hudson.model.TaskListener listener, net.praqma.jenkins.configrotator.ConfigurationRotatorBuildAction action) {
    for (net.praqma.jenkins.configrotator.AbstractPostConfigurationRotator l : net.praqma.jenkins.configrotator.AbstractPostConfigurationRotator.all()) {
        if (l.tiedTo().equals(action.getClazz())) {
            if (!(l.perform(workspace, listener, action))) {
                return false;
            }
        }
    }
    return true;
}