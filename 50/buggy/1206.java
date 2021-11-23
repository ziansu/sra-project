@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mLoginPresenter = PresenterHolder.SINGLETON.getLoginPresenter();
    mLoginPresenter.setLoginFragment(this);
    com.example.tyudy.ticket2rideclient.common.commands.TestinationCommand.testit();
}