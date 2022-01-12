@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_recycler, container, false);
    recyclerView = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.recyclerext_fragment_recycler)));
    fastScroll = ((com.devbrackets.android.recyclerext.widget.FastScroll) (view.findViewById(R.id.recyclerext_fast_scroll)));
    fastScroll.setVisibility(View.VISIBLE);
    return view;
}