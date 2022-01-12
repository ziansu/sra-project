@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.tv_show_search_fragment, container, false);
    rv = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.searched_tv_series_list)));
    rv.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(rv.getContext()));
    adapter = new a501.itis.kpfu.ru.themoviedbapplication.adapter.SearchedTvShowListAdapter(getActivity(), list);
    rv.setAdapter(adapter);
    return view;
}