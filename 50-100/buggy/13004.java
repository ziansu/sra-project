public void start(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    super.start(context);
    net.bioclipse.balloon.business.Activator.plugin = this;
    javaScriptFinderTracker = new org.osgi.util.tracker.ServiceTracker(context, net.bioclipse.balloon.business.IJavaScriptBalloonManager.class.getName(), null);
    javaScriptFinderTracker.open();
    javaFinderTracker = new org.osgi.util.tracker.ServiceTracker(context, net.bioclipse.balloon.business.IJavaBalloonManager.class.getName(), null);
    javaFinderTracker.open();
    getPreferenceStore().setDefault(net.bioclipse.balloon.business.Activator.BALLOON_TIMEOUT, net.bioclipse.balloon.business.Activator.DEFAULT_BALLOON_TIMEOUT);
}