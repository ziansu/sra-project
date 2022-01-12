@java.lang.Override
public void onResume() {
    super.onResume();
    android.content.SharedPreferences prefs = getActivity().getSharedPreferences(Constants.SHARED_PREF_FILE_PREFERENCES, Context.MODE_PRIVATE);
    if ((!(prefs.getBoolean(Constants.SHARED_PREF_KEY_WAITING, false))) && (!(prefs.getBoolean(Constants.SHARED_PREF_KEY_DRIVING, false)))) {
        nfcAdapter.enableForegroundDispatch(getActivity(), nfcPendingIntent, null, null);
    }
}