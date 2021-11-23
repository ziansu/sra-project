@java.lang.Override
public void start(org.osgi.framework.BundleContext context) {
    tracker = new org.osgi.util.tracker.BundleTracker(context, org.osgi.framework.Bundle.ACTIVE, new osgi.extender.jpa.service.JpaBundleChangeListener(context.getBundle()));
    new java.lang.Thread(() -> tracker.open()).start();
}