@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_register, container, false);
    mUnbinder = butterknife.ButterKnife.bind(this, view);
    layoutManager = new android.support.v7.widget.GridLayoutManager(getActivity(), 3);
    recyclerView.setLayoutManager(layoutManager);
    return view;
}