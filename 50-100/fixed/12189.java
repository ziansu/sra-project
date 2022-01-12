@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_home :
            android.content.Intent homeIntentVE = new android.content.Intent(this, com.easysplit.mainview.MainActivity.class);
            startActivity(homeIntentVE);
            return true;
        case R.id.action_logout :
            android.content.Intent logoutIntentVEx = new android.content.Intent(this, com.easysplit.mainview.UserLogin.class);
            startActivity(logoutIntentVEx);
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}