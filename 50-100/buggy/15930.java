@java.lang.Override
protected void publishResults(java.lang.CharSequence constraint, com.mikepenz.fastadapter.adapters.FilterResults results) {
    if ((results.values) != null) {
        this.set(((java.util.List<Item>) (results.values)));
    }
    if ((mItemFilterListener) != null) {
        mItemFilterListener.itemsFiltered();
    }
}