public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
            overridePendingTransition(R.anim.slide_out_left_to_right, R.anim.slide_in_left_to_right);
            return true;
    }
    return super.onOptionsItemSelected(item);
}