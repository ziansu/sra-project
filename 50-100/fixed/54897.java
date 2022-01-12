@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    final android.view.View rootView = inflater.inflate(R.layout.pager_fragment, container, false);
    viewPager = ((android.support.v4.view.ViewPager) (rootView.findViewById(R.id.pager)));
    if ((viewPager) != null) {
        setupViewPager(viewPager);
    }
    android.support.design.widget.TabLayout tabLayout = ((android.support.design.widget.TabLayout) (rootView.findViewById(R.id.tabs)));
    tabLayout.setupWithViewPager(viewPager);
    return rootView;
}