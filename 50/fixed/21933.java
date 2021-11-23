public com.quantiply.samza.Counter counter(java.lang.String name) {
    return registerWithSamza(name, codaRegistry.counter(name));
}