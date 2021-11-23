@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_horizontal_cards, container, false);
    butterknife.ButterKnife.bind(this, view);
    locatablePager.setAdapter(new com.life360.android.protomap.ui.LocatablePagerAdapter(getChildFragmentManager(), locatables));
    if ((onPageChangeListener) != null) {
        java.lang.System.out.println("SETTING PAGE LISTENER");
        locatablePager.addOnPageChangeListener(onPageChangeListener);
    }
    return view;
}