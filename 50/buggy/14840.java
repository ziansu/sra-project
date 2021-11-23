@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    mPresenter = new com.abhinav.keepsafe.login.LoginPresenter();
    return inflater.inflate(R.layout.fragment_login, container, false);
}