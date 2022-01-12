public void start(org.osgi.framework.BundleContext context) {
    java.lang.System.out.println("NetIDE CaOs module started!");
    _shimManagerTracker = new org.osgi.util.tracker.ServiceTracker(context, eu.netide.core.api.IShimManager.class.getName(), null);
    _shimManagerTracker.open();
    java.lang.System.out.println((("Watching " + (_shimManagerTracker.size())) + " services at start."));
}