@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    switch (requestCode) {
        case SettingsActivity.SettingsFragment.LANGUAGE_CHANGED :
            if (resultCode == (SettingsActivity.SettingsFragment.LANGUAGE_CHANGED)) {
                startActivity(com.development.vvoitsekh.favoritequotes.ui.main.MainActivity.newIntent(this));
                finish();
            }
            break;
    }
}