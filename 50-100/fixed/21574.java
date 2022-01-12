@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.tv_series_fragment, container, false);
    rv = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.tv_series_recycler)));
    rv.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(rv.getContext(), android.support.v7.widget.LinearLayoutManager.HORIZONTAL, false));
    if ((list) != null) {
        a501.itis.kpfu.ru.themoviedbapplication.adapter.MyListAdapter adapter = new a501.itis.kpfu.ru.themoviedbapplication.adapter.MyListAdapter(getActivity(), list, 2);
        rv.setAdapter(adapter);
    }
    return view;
}