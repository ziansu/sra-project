public void insertPosition(java.lang.String tag, int start, int end) {
    java.util.LinkedList<net.sf.jabref.gui.plaintextimport.TagToMarkedTextStore.TMarkedStoreItem> ll = tagMap.get(tag);
    if (ll == null) {
        ll = new java.util.LinkedList<>();
        tagMap.put(tag, ll);
    }else {
        ll.clear();
    }
    net.sf.jabref.gui.plaintextimport.TagToMarkedTextStore.TMarkedStoreItem item = new net.sf.jabref.gui.plaintextimport.TagToMarkedTextStore.TMarkedStoreItem();
    ll.add(item);
    item.end = end;
    item.start = start;
}