public static java.lang.String keyToTransform(io.cloudslang.lang.compiler.modeller.transformers.Transformer transformer) {
    java.lang.String key;
    if ((transformer.keyToTransform()) != null) {
        key = transformer.keyToTransform();
    }else {
        java.lang.String simpleClassName = transformer.getClass().getSimpleName();
        key = org.apache.commons.lang3.StringUtils.substringBefore(simpleClassName, io.cloudslang.lang.compiler.modeller.transformers.Transformer.class.getSimpleName());
    }
    return key.toLowerCase();
}