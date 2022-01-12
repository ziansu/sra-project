@java.lang.Override
public void onClick(com.afollestad.materialdialogs.MaterialDialog dialog, com.afollestad.materialdialogs.DialogAction which) {
    com.adithyaupadhya.database.sharedpref.AppPreferenceManager.getAppPreferenceInstance(this).clearAllUserPreferenceData();
    startActivity(new android.content.Intent(this, com.adithyaupadhya.moviemaniac.login.SignInActivity.class));
    finish();
}