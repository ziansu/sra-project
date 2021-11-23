@android.annotation.TargetApi(value = Build.VERSION_CODES.M)
@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        mParam1 = getArguments().getString(nl.jackevers.jwraats.contactcard.PersonListFragment.ARG_PARAM1);
        mParam2 = getArguments().getString(nl.jackevers.jwraats.contactcard.PersonListFragment.ARG_PARAM2);
    }
    mAdapter = new nl.jackevers.jwraats.contactcard.PersonAdapter(getActivity().getLayoutInflater(), PersonStorage.ITEMS);
}