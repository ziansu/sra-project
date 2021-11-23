@java.lang.Override
public void onPrepared() {
    super.onPrepared();
    com.sample.boot.module.splash.SplashView view = getView();
    if (view == null) {
        return ;
    }
    if (view.isViewResumed()) {
        view.directToSignIn();
    }
}