@java.lang.Override
public void invoke() {
    try {
        org.robovm.compiler.config.Config config = build(OS.ios, Arch.thumbv7, TargetType.ios, false);
        org.robovm.compiler.target.ios.IOSTarget target = ((org.robovm.compiler.target.ios.IOSTarget) (config.getTarget()));
        target.createIpa();
    } catch (java.io.IOException e) {
        throw new org.gradle.api.GradleException("Failed to create IPA", e);
    }
}