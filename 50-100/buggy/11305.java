@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_future, container, false);
    fab = view.findViewById(R.id.futureFab);
    eventRecycler = view.findViewById(R.id.eventsRecycler);
    eventRecycler.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getActivity().getApplicationContext()));
    tvNoData = view.findViewById(R.id.tvNoFutureData);
    onClickListeners();
    checkPermission();
    d.getTime();
    return view;
}