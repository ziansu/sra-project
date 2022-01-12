@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_logout)) {
        mFirebaseAuth.signOut();
        loadLogInView();
    }
    if (id == (R.id.action_soundOff)) {
        if (soundOff = false) {
            soundOff = true;
        }else {
            soundOff = false;
        }
    }
    return super.onOptionsItemSelected(item);
}