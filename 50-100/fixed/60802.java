private java.util.List<java.lang.Double> createExpectedList(int expectedInt, int size) {
    java.util.List<java.lang.Double> expected = new java.util.ArrayList<>(size);
    for (int i = 0; i < size; i++) {
        if (i == expectedInt)
            expected.add(1.0);
        else
            expected.add(0.0);
        
    }
    return expected;
}