@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.history, container, false);
    mListView = view.findViewById(R.id.show_list);
    mListView.setOnItemClickListener(this);
    android.view.View headerView = inflater.inflate(R.layout.list_header, mListView, false);
    mListView.addHeaderView(headerView);
    com.fcao.quakemonitor.QuakeAdapter adapter = new com.fcao.quakemonitor.QuakeAdapter(getContext(), recordList);
    mListView.setAdapter(adapter);
    return view;
}