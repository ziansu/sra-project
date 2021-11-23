@java.lang.Override
public java.lang.Object process(javax.cache.processor.MutableEntry<java.lang.String, main.java.streaming.ignite.server.MeasurementInfo> e, java.lang.Object... arg) throws javax.cache.processor.EntryProcessorException {
    e.setValue(((main.java.streaming.ignite.server.MeasurementInfo) (arg[0])));
    return null;
}