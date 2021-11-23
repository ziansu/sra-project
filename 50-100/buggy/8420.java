@java.lang.Override
public void replaceAll(java.util.List<T> elements) {
    if ((elements == null) || (elements.isEmpty())) {
        return ;
    }
    if ((mData) == null) {
        mData = new java.util.ArrayList<>();
    }
    mData.clear();
    mData.addAll(elements);
    notifyDataSetChanged();
}