private void addServiceLoaderListeners() {
    java.lang.Iterable<org.testng.ITestNGListener> loader = ((m_serviceLoaderClassLoader) != null) ? java.util.ServiceLoader.load(org.testng.ITestNGListener.class, m_serviceLoaderClassLoader) : java.util.ServiceLoader.load(org.testng.ITestNGListener.class);
    for (org.testng.ITestNGListener l : loader) {
        org.testng.internal.Utils.log("[TestNG]", 2, ("Adding ServiceLoader listener:" + l));
        addListener(l);
        addServiceLoaderListener(l);
    }
}