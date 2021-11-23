@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.account);
    android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    findPreference("actionChangeUser").setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {
        @java.lang.Override
        public boolean onPreferenceClick(android.preference.Preference preference) {
            com.google.firebase.auth.FirebaseAuth.getInstance().signOut();
            startActivity(new android.content.Intent(getActivity(), com.whirlwind.school1.activity.SigninActivity.class));
            return true;
        }
    });
}