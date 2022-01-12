private void addServiceLoaderListeners() {
    java.lang.Iterable<org.testng.ITestNGListener> loader = java.util.ServiceLoader.load(org.testng.ITestNGListener.class, m_serviceLoaderClassLoader);
    for (org.testng.ITestNGListener l : loader) {
        org.testng.internal.Utils.log("[TestNG]", 2, ("Adding ServiceLoader listener:" + l));
        addListener(l);
        addServiceLoaderListener(l);
    }
}