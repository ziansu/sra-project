@java.lang.Override
public void onResume() {
    if ((getPresenter()) != null) {
        getPresenter().refreshMuteState();
    }
    super.onResume();
    updateColors();
}