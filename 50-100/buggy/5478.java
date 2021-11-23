@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.util.Log.d(TAG, "onCreateView");
    android.view.View rootView = inflater.inflate(R.layout.fragment_events_list, container, false);
    mDatabase = com.google.firebase.database.FirebaseDatabase.getInstance().getReference().child("Event");
    rv = ((android.support.v7.widget.RecyclerView) (rootView.findViewById(R.id.events_list_recycler_view)));
    rv.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getActivity()));
    rv.setAdapter(fbRecyclerAdapter);
    return rootView;
}