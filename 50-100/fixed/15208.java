@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.main_page_movies_list, container, false);
    rv = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.movies_list)));
    rv.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(rv.getContext(), android.support.v7.widget.LinearLayoutManager.HORIZONTAL, false));
    if ((list) != null) {
        a501.itis.kpfu.ru.themoviedbapplication.adapter.MyListAdapter adapter = new a501.itis.kpfu.ru.themoviedbapplication.adapter.MyListAdapter(getActivity(), list, 1);
        rv.setAdapter(adapter);
    }
    return view;
}