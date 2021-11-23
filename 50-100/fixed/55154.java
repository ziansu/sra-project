@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.action_profile :
            {
                android.content.Intent intent = new android.content.Intent(this, com.sarahehabm.carbcalculator.profile.ProfileActivity.class);
                startActivity(intent);
                return true;
            }
        default :
            return super.onOptionsItemSelected(item);
    }
}