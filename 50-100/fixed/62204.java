@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String newEmail = inputEmail.getText().toString();
    com.engstuff.coloriphornia.helpers.PrefsHelper.writeToPrefs(activity, Cv.SAVED_EMAILS, newEmail, newEmail);
    android.widget.Toast.makeText(activity, (((text(R.string.toast_email)) + newEmail) + (text(R.string.toast_hb_saved))), Toast.LENGTH_SHORT).show();
    activity.recreate();
}