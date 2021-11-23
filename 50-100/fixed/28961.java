@java.lang.Override
public boolean onPreferenceStartScreen(android.support.v7.preference.PreferenceFragmentCompat preferenceFragmentCompat, android.support.v7.preference.PreferenceScreen preferenceScreen) {
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    de.tum.in.tumcampusapp.fragments.SettingsFragment fragment = new de.tum.in.tumcampusapp.fragments.SettingsFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putString(PreferenceFragmentCompat.ARG_PREFERENCE_ROOT, preferenceScreen.getKey());
    fragment.setArguments(args);
    ft.replace(R.id.settings_frame, fragment, preferenceScreen.getKey());
    ft.addToBackStack(preferenceScreen.getKey());
    ft.commit();
    return true;
}