@java.lang.Override
protected void refreshFragment() {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    mFragment = ((com.romanpulov.violetnote.view.BasicNoteCheckedItemFragment) (fm.findFragmentById(getFragmentContainerId())));
    if ((mFragment) == null) {
        mFragment = com.romanpulov.violetnote.view.BasicNoteCheckedItemFragment.newInstance(mBasicNoteData);
        fm.beginTransaction().replace(getFragmentContainerId(), mFragment).commit();
    }
}