@java.lang.Override
public final void onTokenExpired() {
    if ((view.get()) != null) {
        view.get().hideProgress();
        view.get().onTokenExpired();
    }
}