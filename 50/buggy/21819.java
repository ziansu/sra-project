private void goToWelcome() {
    android.content.Intent welcomeIntent = new android.content.Intent(this, edu.gatech.cs2340.rattracker.controller.WelcomeActivity.class);
    startActivity(welcomeIntent);
    finish();
}