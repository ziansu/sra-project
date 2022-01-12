@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    mContext = getContext();
    android.os.Bundle args = getArguments();
    if (args != null) {
        mChangeId = args.getString(com.jbirdvegas.mgerrit.fragments.LabelsFragment.CHANGE_ID);
        getLoaderManager().initLoader(com.jbirdvegas.mgerrit.fragments.LabelsFragment.LOADER_LABELS, null, this);
    }
}