protected java.lang.Object readResolve() {
    iterationListeners = new java.util.LinkedList<>();
    children = new java.util.concurrent.ConcurrentHashMap<org.apache.jmeter.testelement.TestElement, java.lang.Object>();
    subControllersAndSamplers = new java.util.ArrayList<>();
    return this;
}