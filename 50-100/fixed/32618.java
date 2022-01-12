@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_scan :
            {
                break;
            }
        case R.id.action_list :
            {
                android.content.Intent i = new android.content.Intent(this, com.google.android.gms.samples.vision.barcodereader.ListCustomers.class);
                startActivity(i);
                break;
            }
        case R.id.action_export :
            {
                break;
            }
        case R.id.action_info :
            {
                android.content.Intent i = new android.content.Intent(this, com.google.android.gms.samples.vision.barcodereader.ListCustomers.class);
                startActivity(i);
                break;
            }
    }
    return false;
}