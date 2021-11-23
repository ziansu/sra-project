@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (android.R.id.home)) {
        android.os.Bundle b = getIntent().getExtras();
        if ((b != null) && (b.getBoolean(Constants.INTENT_FROM_WIDGET, false))) {
            android.content.Intent intent = new android.content.Intent(this, nl.privacybarometer.privacyvandaag.activity.HomeActivity.class);
            startActivity(intent);
        }
        finish();
        return true;
    }
    return false;
}