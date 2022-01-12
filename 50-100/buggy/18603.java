private boolean maybeInjectMe() {
    if (alreadyInjected) {
        return true;
    }
    android.content.Context appContext = getContext().getApplicationContext();
    if (!(appContext instanceof com.google.android.stardroid.StardroidApplication)) {
        return false;
    }
    com.google.android.stardroid.ApplicationComponent component = ((com.google.android.stardroid.StardroidApplication) (appContext)).getApplicationComponent();
    component.inject(this);
    alreadyInjected = true;
    return true;
}