@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    if (!((this) instanceof nl.group11.planplan.EventsFragmentFav)) {
        android.support.v7.widget.RecyclerView recyclerView = ((android.support.v7.widget.RecyclerView) (getActivity().findViewById(R.id.eventsRecycler)));
        recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new nl.group11.planplan.EventfulAdapter(getContext(), new nl.group11.planplan.EventfulDynamicSearch("Eindhoven", 100)));
    }
}