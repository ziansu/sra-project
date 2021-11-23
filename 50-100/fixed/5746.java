public void setCurrentForgroundActivity(android.app.Activity activity) {
    if (activity != null) {
        currentForgroundApptentiveActivity = new java.lang.ref.WeakReference<android.app.Activity>(activity);
    }else {
        com.apptentive.android.sdk.module.messagecenter.ApptentiveToastNotificationManager manager = com.apptentive.android.sdk.module.messagecenter.ApptentiveToastNotificationManager.getInstance(null, false);
        if (manager != null) {
            manager.cleanUp();
        }
        currentForgroundApptentiveActivity = null;
    }
}