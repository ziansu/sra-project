private void goToStartMenu() {
    java.lang.String userEmail = getSharedPreferences(getString(R.string.shared_prefs), Context.MODE_PRIVATE).getString(getString(R.string.user_email), "");
    android.widget.Toast.makeText(getApplicationContext(), ("Signed in as: " + userEmail), Toast.LENGTH_LONG).show();
    android.content.Intent intent = new android.content.Intent(this, group7.tcss450.tacoma.uw.edu.overrun.StartMenuActivity.class);
    startActivity(intent);
    finish();
}