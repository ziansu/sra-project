@java.lang.Override
public void onRequiredAuthorization() {
    if ((view.get()) != null) {
        view.get().hideProgress();
        view.get().onRequiredLogin();
    }
}