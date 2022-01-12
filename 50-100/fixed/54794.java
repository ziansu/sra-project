@java.lang.Override
protected void onResume() {
    super.onResume();
    com.reactnativenavigation.controllers.SplashActivity.isResumed = true;
    if (NavigationApplication.instance.getReactGateway().hasStartedCreatingContext()) {
        NavigationApplication.instance.getEventEmitter().sendAppLaunchedEvent();
        return ;
    }
    if (com.reactnativenavigation.react.ReactDevPermission.shouldAskPermission()) {
        com.reactnativenavigation.react.ReactDevPermission.askPermission(this);
        return ;
    }
    if (NavigationApplication.instance.isReactContextInitialized()) {
        NavigationApplication.instance.getEventEmitter().sendAppLaunchedEvent();
        return ;
    }
    NavigationApplication.instance.startReactContextOnceInBackgroundAndExecuteJS();
}