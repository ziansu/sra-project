public void appendPosition(java.lang.String tag, int start, int end) {
    java.util.List<net.sf.jabref.gui.plaintextimport.TagToMarkedTextStore.TMarkedStoreItem> ll = tagMap.get(tag);
    if (ll == null) {
        ll = new java.util.ArrayList<>();
        tagMap.put(tag, ll);
    }
    ll.add(new net.sf.jabref.gui.plaintextimport.TagToMarkedTextStore.TMarkedStoreItem(start, end));
}