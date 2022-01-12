@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    getListView().addHeaderView(descriptionView, null, false);
    getListView().addFooterView(loadProgressView, null, false);
    showingProgress = true;
    adapter = new cz.eman.infinitescroll.ui.adapter.MovieAdapter(getActivity().getApplicationContext());
    setListAdapter(adapter);
    getListView().setOnScrollListener(this);
    getListView().setOnItemClickListener(this);
    loadData(currentPage);
}