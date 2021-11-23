@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            java.lang.String message = null;
            android.content.Intent intent = new android.content.Intent(this, com.personal.learn_android.HomeActivity.class);
            intent.putExtra(com.personal.learn_android.GuestActivity.EXTRA_MESSAGE, message);
            setResult(Activity.RESULT_OK, intent);
            finish();
    }
    return super.onOptionsItemSelected(item);
}