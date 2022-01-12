public com.quantiply.samza.Timer timer(java.lang.String name) {
    return registerWithSamza(name, codaRegistry.timer(name));
}