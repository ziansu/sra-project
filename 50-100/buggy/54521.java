@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup parent, android.os.Bundle savedInstanceState) {
    android.view.View ret = inflater.inflate(R.layout.layout_simple_list_menu, parent, false);
    emptyView = ret.findViewById(R.id.id_empty_view);
    listView = ((android.support.v7.widget.RecyclerView) (ret.findViewById(R.id.id_list_view_main_menu)));
    listView.setAdapter(adapter);
    listView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(parent.getContext()));
    currentItemIndex = 0;
    adapter.highlightItem(0);
    checkEmpty();
    return ret;
}