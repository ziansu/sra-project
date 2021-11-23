public void start(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    super.start(context);
    uk.org.secondfiddle.pep.plugins.PatchActivator.plugin = this;
    safeRun(new uk.org.secondfiddle.pep.plugins.patch.osgiresolver.OsgiResolverPatch());
    safeRun(new uk.org.secondfiddle.pep.plugins.patch.classpath.UpdateClasspathsJobPatch());
}