@java.lang.Override
public void onSuccess(com.andela.helpmebuy.models.User user) {
    android.support.design.widget.Snackbar.make(parentLayout, "Password changed successfully", Snackbar.LENGTH_LONG).show();
    android.os.Bundle bundle = getIntent().getBundleExtra(Launcher.TRANSPORT);
    if (bundle != null) {
        if (bundle.getBoolean(ConfirmPasswordFragment.CONFIRM_PASSWORD)) {
            com.andela.helpmebuy.utilities.Launcher.launchActivity(this, com.andela.helpmebuy.activities.UserSettingsActivity.class);
        }
    }else {
        com.andela.helpmebuy.utilities.Launcher.launchActivity(this, com.andela.helpmebuy.activities.HomeActivity.class);
    }
    finish();
}