private static void constructorTest() {
    ArrayDequeTest.log("constructorTest: ");
    ArrayDeque<java.lang.String> ad = new ArrayDeque();
    boolean passed = ArrayDequeTest.checkEmpty(true, ad.isEmpty());
    passed = (ArrayDequeTest.checkSize(0, ad.size())) && passed;
    passed = ((ad.get(0)) == null) && passed;
    ArrayDequeTest.logTestResult(passed, "constructorTest");
}