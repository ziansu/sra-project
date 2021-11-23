@java.lang.Override
public void onBandUpErrorResponse(com.android.volley.VolleyError error) {
    android.util.Log.d(com.melodies.bandup.gcm_tools.RegistrationIntentService.TAG, error.getMessage());
}