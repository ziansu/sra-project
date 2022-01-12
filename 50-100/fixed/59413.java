@java.lang.Override
public void execute() throws org.apache.maven.plugin.MojoExecutionException, org.apache.maven.plugin.MojoFailureException {
    try {
        org.robovm.compiler.config.Config config = buildArchive(OS.ios, Arch.thumbv7, TargetType.ios).getConfig();
        org.robovm.compiler.target.ios.IOSTarget target = ((org.robovm.compiler.target.ios.IOSTarget) (config.getTarget()));
        target.createIpa();
    } catch (java.io.IOException e) {
        throw new org.apache.maven.plugin.MojoExecutionException("Failed to create IPA", e);
    }
}