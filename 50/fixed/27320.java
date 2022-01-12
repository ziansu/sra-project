@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    startActivity(new android.content.Intent(this, ch.defiant.purplesky.activities.AboutActivity.class));
    return true;
}