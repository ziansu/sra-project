@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_sequencelibrary, container, false);
    mListView = ((android.widget.AbsListView) (view.findViewById(android.R.id.list)));
    ((android.widget.AdapterView<android.widget.ListAdapter>) (mListView)).setAdapter(mAdapter);
    mListView.setOnItemClickListener(this);
    mListView.setOnItemLongClickListener(this);
    return view;
}