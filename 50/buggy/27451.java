@java.lang.Override
public int getItemViewType(int position) {
    return separators.contains(position) ? com.orgzly.android.ui.AgendaListViewAdapter.TYPE_SEPARATOR : com.orgzly.android.ui.AgendaListViewAdapter.TYPE_ITEM;
}