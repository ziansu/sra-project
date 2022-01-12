@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    android.support.v4.app.Fragment fragment = null;
    switch (position) {
        case 0 :
            mTaskFragment = new com.ckt.ckttodo.ui.TaskFragment();
            fragment = mTaskFragment;
            break;
        case 1 :
            fragment = new com.ckt.ckttodo.ui.ProjectFragment();
            break;
    }
    mFragmentList.add(fragment);
    return fragment;
}