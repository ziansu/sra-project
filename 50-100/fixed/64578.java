@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
    android.content.Intent intent = null;
    super.onOptionsItemSelected(menuItem);
    switch (menuItem.getItemId()) {
        case android.R.id.home :
            finish();
            break;
        case R.id.home_button :
            intent = new android.content.Intent(this, com.example.c301_w16_g5.c301_w16_g5.HomeActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            break;
        case R.id.notifications_button :
            intent = new android.content.Intent(this, com.example.c301_w16_g5.c301_w16_g5.NotificationsActivity.class);
            startActivity(intent);
            break;
    }
    return true;
}