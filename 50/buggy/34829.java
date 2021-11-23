@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            getFragmentManager().popBackStack();
            break;
        case R.id.action_settings :
            break;
    }
    return true;
}