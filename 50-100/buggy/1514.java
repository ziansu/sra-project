@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_main, container, false);
    listView = ((android.widget.ListView) (rootView.findViewById(android.R.id.list)));
    graphsList = generateDescriptions();
    adapter = new deltagraphs.norrisviewer.presenter.mainPresenter.MainPresenterImpl.ChartAdapter(getActivity(), 0, graphsList);
    listView.setAdapter(adapter);
    listView.setOnItemClickListener(this);
    return rootView;
}