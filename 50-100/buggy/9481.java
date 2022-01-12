@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    showLoading(true);
    if (getArguments().containsKey(com.yomiolatunji.andela.lagosjavadev.ui.UserDetailFragment.ARG_USERNAME)) {
        loadUser(getArguments().getString(com.yomiolatunji.andela.lagosjavadev.ui.UserDetailFragment.ARG_USERNAME));
        android.app.Activity activity = this.getActivity();
    }else {
        loadUser(getActivity().getIntent().getStringExtra(com.yomiolatunji.andela.lagosjavadev.ui.UserDetailFragment.ARG_USERNAME));
    }
}