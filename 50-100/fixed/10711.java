public void shutdown() {
    if ((bundleContext) != null) {
        try {
            bundleContext.getBundle(0).stop();
        } catch (org.osgi.framework.BundleException e) {
            e.printStackTrace();
        } catch (java.lang.NullPointerException e) {
            java.lang.System.exit(0);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}