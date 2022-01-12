@java.lang.Override
protected void onPause() {
    super.onPause();
    com.reactnativenavigation.controllers.NavigationActivity.currentActivity = null;
    com.reactnativenavigation.controllers.IntentDataHandler.onPause(getIntent());
    getReactGateway().onPauseActivity();
    NavigationApplication.instance.getActivityCallbacks().onActivityPaused(this);
    EventBus.instance.unregister(this);
}