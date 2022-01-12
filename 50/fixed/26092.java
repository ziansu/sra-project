@java.lang.Override
public void run(java.lang.String... params) {
    closeWindow();
    presenter.afterNewKeyInput(params[0]);
}