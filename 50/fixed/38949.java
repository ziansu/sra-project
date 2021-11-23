@java.lang.Override
public void onActivityStarted(android.app.Activity activity) {
    if (isFirstLaunch.compareAndSet(true, false)) {
        onAppDidEnterForeground();
        return ;
    }
    if ((appState) == (com.jenzz.appstate.AppState.BACKGROUND)) {
        onAppDidEnterForeground();
    }
}