@java.lang.Override
public java.io.File getYarnPath() {
    java.lang.String yarnExecutable = (getPlatform().isWindows()) ? com.github.eirslett.maven.plugins.frontend.lib.InstallYarnExecutorConfig.YARN_WINDOWS : com.github.eirslett.maven.plugins.frontend.lib.InstallYarnExecutorConfig.YARN_DEFAULT;
    return new java.io.File(((this.installConfig.getInstallDirectory()) + yarnExecutable));
}