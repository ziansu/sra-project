protected java.lang.Object readResolve() {
    iterationListeners = new java.util.LinkedList<>();
    children = (org.apache.jmeter.threads.TestCompiler.IS_USE_STATIC_SET) ? null : new java.util.concurrent.ConcurrentHashMap<org.apache.jmeter.testelement.TestElement, java.lang.Object>();
    subControllersAndSamplers = new java.util.ArrayList<>();
    return this;
}