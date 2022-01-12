@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        mFile = getArguments().getParcelable(com.owncloud.android.ui.fragment.SearchShareesFragment.ARG_FILE);
        mAccount = getArguments().getParcelable(com.owncloud.android.ui.fragment.SearchShareesFragment.ARG_ACCOUNT);
    }
    setStyle(DialogFragment.STYLE_NO_TITLE, 0);
}