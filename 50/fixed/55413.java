@java.lang.Override
public boolean isSupported(java.lang.Class<?> chronoType) {
    return net.time4j.SystemFormatEngine.SUPPORTED_TYPES.contains(chronoType);
}