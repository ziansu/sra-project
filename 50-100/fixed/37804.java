public void toaster(java.lang.String message, int duration) {
    final java.lang.String toastMessage = message;
    final int toastDuration = duration;
    java.lang.Boolean permission = android.preference.PreferenceManager.getDefaultSharedPreferences(this).getBoolean(PreferenceKey.PREF_PERMISION.toString(), false);
    if (permission) {
        mHandler.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                android.widget.Toast.makeText(tcslab.syndesiapp.controllers.localization.WifiService.this, toastMessage, toastDuration).show();
            }
        });
    }
}