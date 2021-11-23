public void setCurrentForgroundActivity(android.app.Activity activity) {
    if (activity != null) {
        currentForgroundApptentiveActivity = new java.lang.ref.WeakReference<android.app.Activity>(activity);
    }else
        if ((currentForgroundApptentiveActivity) != null) {
            com.apptentive.android.sdk.module.messagecenter.ApptentiveToastNotificationManager manager = com.apptentive.android.sdk.module.messagecenter.ApptentiveToastNotificationManager.getInstance(currentForgroundApptentiveActivity.get(), false);
            if (manager != null) {
                manager.cleanUp();
            }
            currentForgroundApptentiveActivity = null;
        }
    
}