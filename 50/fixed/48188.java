@java.lang.Override
public void start(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    super.start(context);
    org.metaborg.spoofax.shell.client.eclipse.Activator.plugin = this;
    injector = org.metaborg.spoofax.eclipse.SpoofaxPlugin.spoofax().injector.createChildInjector(new org.metaborg.spoofax.shell.client.EclipseReplModule());
}