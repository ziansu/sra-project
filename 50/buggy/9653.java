@java.lang.SuppressWarnings(value = { "UnusedDeclaration" })
public static java.util.List<hudson.tasks.Maven.MavenInstallation> getMavenInstallations() {
    return java.util.Arrays.asList(hudson.model.Hudson.getInstance().getDescriptorByType(Maven.DescriptorImpl.class).getInstallations());
}