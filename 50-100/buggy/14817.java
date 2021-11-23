@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.profile :
            android.content.Intent intent = new android.content.Intent(mContext, com.example.android.moveyourthings.Profile.class);
            startActivity(intent);
            finish();
            return true;
        case R.id.vc :
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}