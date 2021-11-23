public com.quantiply.samza.Meter meter(java.lang.String name) {
    com.quantiply.samza.Meter m = codaRegistry.meter(name);
    return registerWithSamza(name, m);
}