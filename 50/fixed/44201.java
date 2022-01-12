@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    android.support.v4.app.Fragment fragment = com.framgia.wsm.screen.main.MainContainerFragment.newInstance(position);
    mFragments.set(position, fragment);
    return fragment;
}