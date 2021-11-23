public static void freeMemoryForTests() {
    android.webkit.WebView.getFactory().getStatics().freeMemoryForTests();
}