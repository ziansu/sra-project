@java.lang.Override
public void replaceAll(java.util.List<T> elements) {
    if ((mData) == null) {
        mData = new java.util.ArrayList<>();
    }
    mData.clear();
    if (elements != null) {
        mData.addAll(elements);
    }
    notifyDataSetChanged();
}