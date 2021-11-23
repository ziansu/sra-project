public void stop(org.osgi.framework.BundleContext bundleContext) throws java.lang.Exception {
    org.cohorte.utilities.json.Activator.context = null;
    org.osgi.framework.Bundle wBundle = org.cohorte.utilities.json.Activator.context.getBundle();
    java.lang.System.out.printf("%50s | Bundle=[%50s][%s] started\n", "Activator.start()", wBundle.getSymbolicName(), wBundle.getVersion());
}