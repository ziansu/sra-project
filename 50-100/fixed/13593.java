@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_child_dashboard, container, false);
    butterknife.ButterKnife.bind(this, view);
    creekPreferences = new com.sortedqueue.programmercreek.util.CreekPreferences(getContext());
    firebaseDatabaseHandler = new com.sortedqueue.programmercreek.database.firebase.FirebaseDatabaseHandler(getActivity());
    initUI();
    return view;
}