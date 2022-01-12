@java.lang.Override
public int getItemViewType(int position) {
    return position == 0 ? com.aspsine.zhihu.daily.ui.adapter.NavigationDrawerAdapter.Type.TYPE_HEADER : com.aspsine.zhihu.daily.ui.adapter.NavigationDrawerAdapter.Type.TYPE_ITEM;
}