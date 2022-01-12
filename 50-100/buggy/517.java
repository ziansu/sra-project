@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    ru.dubki.logger.Logger.log(this);
    android.view.View rootView = inflater.inflate(R.layout.race_tabs, container, false);
    mSectionsPagerAdapter = new org.vimteam.marshalone.activity.MarksTabFragment.SectionsPagerAdapter(getFragmentManager());
    mViewPager = ((android.support.v4.view.ViewPager) (rootView.findViewById(R.id.container)));
    mViewPager.setAdapter(mSectionsPagerAdapter);
    if (getArguments().getBoolean(org.vimteam.marshalone.activity.MarksTabFragment.WIDESCREEN))
        mViewPager.setCurrentItem(0);
    else
        mViewPager.setCurrentItem(1);
    
    return rootView;
}