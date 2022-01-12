@java.lang.Override
public int getSpanSize(int position) {
    java.util.List<com.simplecityapps.recycler_adapter.model.ViewModel> items = viewModelAdapter.items;
    if ((position > 0) && (position < (items.size()))) {
        return items.get(position).getSpanSize(spanCount);
    }
    return 1;
}