@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (super.onOptionsItemSelected(item)) {
        return true;
    }
    switch (item.getItemId()) {
        case R.id.menu_add_user :
            github.daneren2005.dsub.util.UserUtil.addNewUser(context, this, objects.get(0));
            break;
    }
    return false;
}