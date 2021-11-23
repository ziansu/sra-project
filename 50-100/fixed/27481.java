public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String s) {
    com.dabu.calvus.utils.LogUtils.d("PrefsChanged", s);
    if (s.equals("pref_theme")) {
        if ((getActivity()) != null) {
            android.content.Intent intent = getActivity().getIntent();
            intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.support.v4.content.IntentCompat.FLAG_ACTIVITY_CLEAR_TASK)));
            getActivity().startActivity(intent);
        }
    }
}