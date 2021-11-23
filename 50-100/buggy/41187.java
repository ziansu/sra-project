@java.lang.Override
public void execute() throws org.apache.maven.plugin.MojoExecutionException {
    final org.apache.maven.plugin.logging.Log log = this.getLog();
    com.edugility.jaxb.PackageInfoGenerator generator = this.getPackageInfoGenerator();
    if (generator == null) {
        generator = new com.edugility.jaxb.PackageInfoGenerator(this.getInterfacePackage(), this.getPackageDirectoryRoot());
    }
    final java.util.Set<java.lang.String> packagesToIgnore = this.getPackagesToIgnore();
    if (packagesToIgnore != null) {
        generator.setPackagesToIgnore(packagesToIgnore);
    }
}