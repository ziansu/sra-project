@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.profile :
            android.content.Intent intent = new android.content.Intent(this, me.leops.hashtalk.activity.ProfileActivity.class);
            intent.putExtra("account", mAccount);
            intent.putExtra("password", mManager.getPassword(mAccount));
            startActivity(intent);
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}