@java.lang.Override
public void onCreate() {
    super.onCreate();
    cat.ereza.customactivityoncrash.CustomActivityOnCrash.setLaunchActivityEvenIfInBackground(false);
    cat.ereza.customactivityoncrash.CustomActivityOnCrash.install(this);
}