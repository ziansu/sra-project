@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int itemId = item.getItemId();
    switch (itemId) {
        case android.R.id.home :
            {
                android.content.Intent homeActivity = new android.content.Intent(getApplicationContext(), com.sefy.finalproject.HomeActivity.class);
                homeActivity.putExtras(this.userDetails);
                startActivity(homeActivity);
            }
            break;
        default :
            {
                return super.onOptionsItemSelected(item);
            }
    }
    return true;
}