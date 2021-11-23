private void navigateToMain() {
    android.content.Intent intent = new android.content.Intent(this, com.patels95.sanam.ewb.ui.MainActivity.class);
    startActivity(intent);
    android.widget.Toast.makeText(this, "You have been logged out.", Toast.LENGTH_LONG).show();
}