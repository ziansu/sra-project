private java.util.List<com.saltycode.android.material2.material_playground.model.FeedItem> createItems(int n) {
    final java.util.ArrayList<com.saltycode.android.material2.material_playground.model.FeedItem> items = new java.util.ArrayList<>();
    android.util.Log.d(com.saltycode.android.material2.material_playground.fragment.FeedFragment.class.getSimpleName(), java.lang.String.format("Loading %d items", n));
    final com.saltycode.android.material2.material_playground.model.FeedItem item = new com.saltycode.android.material2.material_playground.model.FeedItem("Morten Salte", "This is a test message. The length of the message is rather long. This is because it is intended to test whether the text abbrevation is working.", 2);
    for (int i = 0; i < n; i++) {
        items.add(item);
    }
    return items;
}