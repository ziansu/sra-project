@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_assignments_recycler, container, true);
    butterknife.ButterKnife.bind(this, view);
    return view;
}