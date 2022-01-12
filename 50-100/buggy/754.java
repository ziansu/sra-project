public java.util.List<com.parse.ParseUser> getSelectedItems() {
    java.util.List<com.parse.ParseUser> result = new java.util.ArrayList(mSelectedItems.size());
    java.util.Iterator<java.lang.Integer> iterator = mSelectedItems.keySet().iterator();
    if (iterator.hasNext()) {
        result.add(mSelectedItems.get(iterator.next()));
    }
    return result;
}