@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case org.stendardo.bsak.qiblih.CompassActivity.EDIT_ID :
            startActivity(new android.content.Intent(this, org.stendardo.bsak.qiblih.QiblihPreferences.class));
            return true;
        case org.stendardo.bsak.qiblih.CompassActivity.CLOSE_ID :
            finish();
            return true;
        case org.stendardo.bsak.qiblih.CompassActivity.README_ID :
            startActivity(new android.content.Intent(this, org.stendardo.bsak.qiblih.ReadmeActivity.class));
            return true;
        case org.stendardo.bsak.qiblih.CompassActivity.LICENSE_ID :
            startActivity(new android.content.Intent(this, org.stendardo.bsak.qiblih.LicenseActivity.class));
            return true;
    }
    return super.onOptionsItemSelected(item);
}