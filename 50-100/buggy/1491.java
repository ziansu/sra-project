private static boolean classOk(java.lang.String className) {
    try {
        org.apache.jmeter.protocol.java.sampler.JavaSamplerClient client = ((org.apache.jmeter.protocol.java.sampler.JavaSamplerClient) (java.lang.Class.forName(className, true, java.lang.Thread.currentThread().getContextClassLoader()).newInstance()));
        return client instanceof org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
    } catch (java.lang.Exception ex) {
        return false;
    }
}