@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.util.Log.d("onCreateView", category);
    android.view.View view = inflater.inflate(R.layout.fragment_gallery, container, false);
    butterknife.ButterKnife.bind(this, view);
    galleryPresenter.create();
    galleryPresenter.attachView(this);
    swipeRefresh.setOnRefreshListener(this);
    recyclerView.setHasFixedSize(true);
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(view.getContext()));
    recyclerView.setAdapter(paintingListAdapter);
    return view;
}