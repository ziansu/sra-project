@java.lang.Override
public int getItemViewType(int id) {
    return separators.contains(id) ? com.orgzly.android.ui.AgendaListViewAdapter.TYPE_SEPARATOR : com.orgzly.android.ui.AgendaListViewAdapter.TYPE_ITEM;
}