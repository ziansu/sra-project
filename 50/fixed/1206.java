@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mLoginPresenter = PresenterHolder.SINGLETON.getLoginPresenter();
    mLoginPresenter.setLoginFragment(this);
}