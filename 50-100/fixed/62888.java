@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View root = inflater.inflate(R.layout.fragment_category, container, false);
    android.support.v7.widget.RecyclerView recyclerView = ((android.support.v7.widget.RecyclerView) (root.findViewById(R.id.recyclerView)));
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
    com.thesis.brown.brown.RecyclerAdapter recyclerAdapter = new com.thesis.brown.brown.RecyclerAdapter(createItemList(50), null);
    recyclerView.setAdapter(recyclerAdapter);
    recyclerView.setVisibility(View.GONE);
    return root;
}