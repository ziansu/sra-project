public static void freeMemoryForTests() {
    checkThread();
    android.webkit.WebView.getFactory().getStatics().freeMemoryForTests();
}