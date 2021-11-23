private void navigateToNavigationActivity() {
    android.content.Intent intent = new android.content.Intent(this, com.example.mobsoft.webkorhaz.ui.navigation.NavigationActivity.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
    startActivity(intent);
}