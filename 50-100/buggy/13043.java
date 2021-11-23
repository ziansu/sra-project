@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    createHandler();
    android.support.v4.app.FragmentManager fm = getFragmentManager();
    mWorkFragment = ((com.betterchat.www.utility.RetainedFragment) (fm.findFragmentByTag("work")));
    if ((mWorkFragment) == null) {
        mWorkFragment = new com.betterchat.www.utility.RetainedFragment();
        mWorkFragment.setTargetFragment(this, 0);
        fm.beginTransaction().add(mWorkFragment, "work").commit();
    }
    client = mWorkFragment.getClient();
}