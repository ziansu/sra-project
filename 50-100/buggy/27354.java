@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    final android.widget.RelativeLayout myView = ((android.widget.RelativeLayout) (inflater.inflate(R.layout.fragment_ranking, container, false)));
    final android.support.v4.view.ViewPager viewPager = ((android.support.v4.view.ViewPager) (myView.findViewById(R.id.viewpager)));
    viewPager.setAdapter(adapter);
    android.support.design.widget.TabLayout tabLayout = ((android.support.design.widget.TabLayout) (myView.findViewById(R.id.fixed_tabs)));
    tabLayout.setupWithViewPager(viewPager);
    return myView;
}