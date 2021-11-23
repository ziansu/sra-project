@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.M)
@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.menuCreate :
            hsnr.arcehfabencasob.www.geocaching.GlobaleKoordinaten.My_GPS activ = new hsnr.arcehfabencasob.www.geocaching.GlobaleKoordinaten.My_GPS(this);
            boolean rights;
            rights = activ.permissioncheck(2);
            if (rights) {
                activ.gpsAn();
            }
            createRiddle();
            return true;
        case R.id.menuLogout :
            finish();
            return true;
        default :
    }
    return super.onOptionsItemSelected(item);
}