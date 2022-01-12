@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);
    android.support.v7.widget.RecyclerView recyclerView = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.recyclerView)));
    android.support.v7.widget.RecyclerView.LayoutManager manager = new android.support.v7.widget.LinearLayoutManager(getActivity());
    recyclerView.setLayoutManager(manager);
    adapter = new com.djonique.birdays.adapters.AllFragmentAdapter(this);
    recyclerView.setAdapter(adapter);
    return view;
}