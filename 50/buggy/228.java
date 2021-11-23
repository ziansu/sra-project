private void initializeInjector() {
    this.activityComponent = getApplicationComponent().plus(new cat.xlagunas.andrtc.di.modules.ActivityModule(this));
    activityComponent.inject(this);
    android.util.Log.d(cat.xlagunas.andrtc.view.activity.LoginActivity.TAG, ("CallbackManager " + (callbackManager.toString())));
}