private void collect() {
    java.time.LocalTime now = java.time.LocalTime.now();
    org.by.issoft.paramCollector.ParamCollector.paramValues.put(org.by.issoft.paramCollector.ParamCollector.obtainer.getCurrentParamValue(), now);
}