@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View listView = inflater.inflate(R.layout.list_fragment, container, false);
    mGridView = ((android.widget.GridView) (listView.findViewById(R.id.grid_view)));
    emptyView = ((android.widget.TextView) (listView.findViewById(android.R.id.empty)));
    mGridView.setEmptyView(emptyView);
    return listView;
}