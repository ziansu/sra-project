@java.lang.Override
public void teardownTest(org.apache.jmeter.protocol.java.sampler.JavaSamplerContext context) {
    end = java.lang.System.currentTimeMillis();
    getNewLogger().info((("cost time: " + ((end) - (start))) + "ms"));
    if (null != (appcontext)) {
        appcontext.destroy();
    }
}