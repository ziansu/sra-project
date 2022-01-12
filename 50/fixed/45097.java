public void fixedWidthArray(java.lang.String name, float elements) {
    hints.put(name, new org.apache.drill.exec.record.VectorInitializer.AllocationHint(0, elements));
}