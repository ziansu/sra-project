@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.save :
            insertData();
            return true;
        case R.id.status :
            android.content.Intent intent = new android.content.Intent(this, com.example.android.topfit.StatusActivity.class);
            startActivity(intent);
            return true;
    }
    return super.onOptionsItemSelected(item);
}