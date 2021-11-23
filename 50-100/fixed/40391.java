public void init() {
    butterknife.ButterKnife.bind(this, rootView);
    initViews();
    initListeners();
    initObjects();
    getMoviesData(pageNumber);
    getActivity().getSupportLoaderManager().initLoader(1, null, this);
}