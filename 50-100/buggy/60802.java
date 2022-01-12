private java.util.List<java.lang.Double> createExpectedList(int expectedInt) {
    java.util.List<java.lang.Double> expected = new java.util.ArrayList<>(3);
    for (int i = 0; i < 3; i++) {
        if (i == expectedInt)
            expected.add(1.0);
        else
            expected.add(0.0);
        
    }
    return expected;
}