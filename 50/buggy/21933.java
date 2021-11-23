public com.quantiply.samza.Counter counter(java.lang.String name) {
    com.quantiply.samza.Counter c = codaRegistry.counter(name);
    return registerWithSamza(name, c);
}