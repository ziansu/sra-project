@java.lang.Override
protected void onRegistered(android.content.Context context, java.lang.String registrationId) {
    android.util.Log.i(com.versatilemobitech.indiontv.GCMIntentService.TAG, ("Device registered: regId = " + registrationId));
    com.versatilemobitech.indiontv.CommonUtilities.displayMessage(context, "Your device registred with GCM");
    android.util.Log.d("NAME", BaseActivity.name);
    com.versatilemobitech.indiontv.ServerUtilities.register(context, BaseActivity.name, BaseActivity.email, registrationId);
}