@java.lang.Override
public void onResume() {
    super.onResume();
    if ((getPresenter()) != null) {
        getPresenter().refreshMuteState();
    }
    updateColors();
}