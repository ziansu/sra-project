public void goToMainActivity(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.android.ubclaunchpad.driver.UI.MainActivity.class);
    startActivity(intent);
}