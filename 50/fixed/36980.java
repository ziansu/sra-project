public void offerRepeatData(de.fau.cs.mad.kwikshop.android.common.Item item) {
    if (!(repeatList.contains(item))) {
        repeatList.add(item);
    }else {
        repeatList.remove(item);
        repeatList.add(item);
    }
}