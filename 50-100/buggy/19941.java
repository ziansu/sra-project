@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.menu_links :
            startActivity(new android.content.Intent(getApplicationContext(), de.svenkaestle.prapp.LinksActivity.class));
            this.finish();
            return true;
        case R.id.menu_contact :
            startActivity(new android.content.Intent(getApplicationContext(), de.svenkaestle.prapp.ContactActivity.class));
            this.finish();
            return true;
        default :
            return true;
    }
}