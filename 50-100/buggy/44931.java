@java.lang.Override
public void onActivityCreated(android.os.Bundle savedState) {
    super.onActivityCreated(savedState);
    mToolbar.setTitle(getString(R.string.career));
    ((net.fabricemk.android.mycv.ui.activities.IToolbarable) (getActivity())).setupToolbar(mToolbar);
    mViewPager.setAdapter(new net.fabricemk.android.mycv.adapters.CareerPagerAdapter(getActivity(), getFragmentManager()));
    mTabLayout.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mTabLayout.setupWithViewPager(mViewPager);
        }
    });
}