private java.util.List<java.lang.Thread> createItems(int n) {
    final java.util.ArrayList<java.lang.Thread> items = new java.util.ArrayList<>();
    android.util.Log.d(com.saltycode.android.material2.material_playground.fragment.FeedFragment.class.getSimpleName(), java.lang.String.format("Loading %d items", n));
    final java.lang.Thread item = new java.lang.Thread("Morten Salte", "This is a test message. The length of the message is rather long. This is because it is intended to test whether the text abbrevation is working.", 2);
    for (int i = 0; i < n; i++) {
        items.add(item);
    }
    return items;
}