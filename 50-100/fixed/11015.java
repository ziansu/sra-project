private void setValues(java.lang.Number n) {
    java.util.Map<java.lang.String, java.lang.Number> m = new java.util.HashMap<java.lang.String, java.lang.Number>();
    for (org.jacoco.core.analysis.ICoverageNode.CounterEntity ce : _default_headers) {
        m.put(ce.name().toLowerCase(), n);
    }
    setValues(m);
}