@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_explore_child, container, false);
    categoryListView = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.recycler_view_explore_child)));
    layoutManager = new android.support.v7.widget.LinearLayoutManager(com.example.sony.ecommerce.Fragment.FragmentExploreChild.context);
    return view;
}