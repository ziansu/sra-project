@java.lang.Override
public java.lang.instrument.ClassFileTransformer getTransformer(java.lang.ClassLoader classLoader, java.lang.String targetClassName) {
    if (transformerMap.isEmpty()) {
        return null;
    }
    java.lang.instrument.ClassFileTransformer transformer = transformerMap.remove(new com.navercorp.pinpoint.profiler.DefaultDynamicTransformerRegistry.TransformerKey(classLoader, targetClassName));
    if (logger.isDebugEnabled()) {
        logger.info("removed dynamic transformer classLoader: {}, className: {}, registry size: {}", classLoader, targetClassName, transformerMap.size());
    }
    return transformer;
}