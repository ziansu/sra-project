@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.fragment_tabbed, container, false);
    mSectionsPagerAdapter = new org.secfirst.umbrella.fragments.TabbedFragment.SectionsPagerAdapter(getChildFragmentManager(), org.secfirst.umbrella.fragments.TabbedFragment.difficulty);
    mViewPager = ((android.support.v4.view.ViewPager) (v.findViewById(R.id.pager)));
    mViewPager.setAdapter(mSectionsPagerAdapter);
    mViewPager.setCurrentItem((getArguments().getBoolean("checklist", false) ? (mSectionsPagerAdapter.getCount()) - 1 : 0));
    return v;
}