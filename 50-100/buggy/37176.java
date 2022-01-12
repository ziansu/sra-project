private static org.apache.commons.jexl3.JexlEngine getJexlEngine() {
    org.apache.commons.jexl3.JexlEngine engine = org.apache.jmeter.functions.Jexl3Function.threadLocalJexl.get();
    if (engine == null) {
        engine = new org.apache.commons.jexl3.JexlBuilder().cache(512).silent(true).strict(true).debug(false).arithmetic(new org.apache.jmeter.functions.Jexl3Function.JMeterArithmetic(true)).create();
        org.apache.jmeter.functions.Jexl3Function.threadLocalJexl.set(engine);
    }
    return engine;
}