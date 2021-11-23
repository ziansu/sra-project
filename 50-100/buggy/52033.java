public static ch.vorburger.osgi.utils.BundleInstaller bootstrapMinecraftOSGi(java.lang.String osgiBasePath, org.spongepowered.api.plugin.PluginContainer pluginContainer) throws java.io.IOException, org.osgi.framework.BundleException {
    java.io.File osgiBaseDirectory = new java.io.File(osgiBasePath);
    ch.vorburger.minecraft.osgi.OSGiFrameworkWrapper osgiFramework = new ch.vorburger.minecraft.osgi.OSGiFrameworkWrapper(osgiBaseDirectory);
    org.osgi.framework.Bundle systemBundle = osgiFramework.start();
    ch.vorburger.minecraft.osgi.api.impl.ApiImplBootstrap apiBootstrap = new ch.vorburger.minecraft.osgi.api.impl.ApiImplBootstrap();
    apiBootstrap.start(systemBundle.getBundleContext(), null);
    osgiFramework.installBootBundles();
    return new ch.vorburger.minecraft.osgi.Bootstrap.Wrapper(osgiFramework, apiBootstrap);
}