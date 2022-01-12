@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.main_recycler_fragment, container, false);
    mainRecycler = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.recycler_view)));
    mLayoutManager = new android.support.v7.widget.GridLayoutManager(getActivity(), 2);
    mainRecycler.setLayoutManager(mLayoutManager);
    mainRecycler.setItemAnimator(new android.support.v7.widget.DefaultItemAnimator());
    moviesDBHelper = new app.com.project.abdullah.movieapp.Helper.MoviesDBHelper(getActivity());
    getData();
    return view;
}