@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case co.launcharea.fitter.R.id.action_post :
            post();
            return true;
        case android.R.id.home :
            android.widget.Toast.makeText(this, "Click home", Toast.LENGTH_SHORT).show();
            finish();
            return true;
        default :
            break;
    }
    return super.onOptionsItemSelected(item);
}