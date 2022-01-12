@java.lang.Override
protected void onResume() {
    super.onResume();
    com.reactnativenavigation.controllers.SplashActivity.isResumed = true;
    if (NavigationApplication.instance.getReactGateway().hasStartedCreatingContext()) {
        NavigationApplication.instance.getEventEmitter().sendAppLaunchedEvent();
        overridePendingTransition(0, 0);
        finish();
        return ;
    }
    if (com.reactnativenavigation.react.ReactDevPermission.shouldAskPermission()) {
        com.reactnativenavigation.react.ReactDevPermission.askPermission(this);
        return ;
    }
    if (NavigationApplication.instance.isReactContextInitialized()) {
        finish();
        return ;
    }
    NavigationApplication.instance.startReactContextOnceInBackgroundAndExecuteJS();
}