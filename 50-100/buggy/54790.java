private void openProgramEditor() {
    android.support.v4.app.Fragment fragment = tech.michaeloverman.android.mscount.dataentry.MetaDataEntryFragment.newInstance(tech.michaeloverman.android.mscount.programmed.ProgrammedMetronomeFragment.mActivity, tech.michaeloverman.android.mscount.programmed.ProgrammedMetronomeFragment.mCursor);
    android.support.v4.app.FragmentTransaction trans = getFragmentManager().beginTransaction();
    trans.replace(R.id.fragment_container, fragment);
    trans.addToBackStack(null);
    trans.commit();
}