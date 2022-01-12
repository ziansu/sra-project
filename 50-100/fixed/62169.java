@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.M)
@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.menuCreate :
            createRiddle();
            return true;
        case R.id.menuLogout :
            finish();
            return true;
        default :
    }
    return super.onOptionsItemSelected(item);
}