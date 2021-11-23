@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.HONEYCOMB)) {
        mActionBar = getActivity().getActionBar();
        java.lang.String username = getActivity().getIntent().getStringExtra(AddPersonFragment.FRIEND_INFO_USERNAME);
        mActionBar.setTitle(username);
        mActionBar.setDisplayHomeAsUpEnabled(true);
    }
    setHasOptionsMenu(true);
    mFragmentManager = getActivity().getSupportFragmentManager();
    mUserId = getActivity().getIntent().getIntExtra(AddPersonFragment.FRIEND_INFO_USER_ID, 0);
}