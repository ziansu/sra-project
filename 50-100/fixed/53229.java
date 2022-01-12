@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    mParent.getSupportActionBar().setTitle(com.versatilemobitech.fmc.utility.Utility.setHeaderTypeface(mParent, com.versatilemobitech.fmc.utility.Utility.getResourcesString(getActivity(), R.string.editorials)));
    if ((rootView) != null) {
        return rootView;
    }
    rootView = inflater.inflate(R.layout.fragment_editorials, container, false);
    initUI();
    return rootView;
}