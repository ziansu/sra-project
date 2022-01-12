@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.preferences);
    preference_loginInfo = ((android.preference.PreferenceCategory) (findPreference(getActivity().getString(R.string.preference_category_user_information_tag))));
    preference_email = findPreference(getActivity().getString(R.string.preference_email_tag));
    preference_logInOut_button = findPreference(getActivity().getString(R.string.preference_logInOut_tag));
}