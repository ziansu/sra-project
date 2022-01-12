public void convert(com.caij.rvadapter.BaseViewHolder holder, T item, int position) {
    int delegatesCount = delegates.size();
    for (int i = delegatesCount - 1; i >= 0; i--) {
        com.caij.rvadapter.delegate.ItemViewDelegate<T> delegate = delegates.valueAt(i);
        if (delegate.isForViewType(item, position)) {
            delegate.convert(holder, item, position);
            return ;
        }
    }
    throw new java.lang.IllegalArgumentException((("No ItemViewDelegateManager added that matches position=" + position) + " in data source"));
}