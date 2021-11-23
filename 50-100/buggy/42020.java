private static void constructorTest() {
    ArrayDequeTest.log("constructorTest: ");
    ArrayDeque<java.lang.String> ad = new ArrayDeque();
    boolean passed = ArrayDequeTest.checkEmpty(true, ad.isEmpty());
    passed = (ArrayDequeTest.checkSize(0, ad.size())) && passed;
    ArrayDequeTest.logTestResult(passed, "constructorTest");
}