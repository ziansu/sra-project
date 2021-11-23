@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_logout)) {
        mFirebaseAuth.signOut();
        loadLogInView();
    }
    if (id == (R.id.action_soundOff)) {
        if ((soundOff) == 0) {
            soundOff = 1;
        }else
            if ((soundOff) == 1) {
                soundOff = 0;
            }
        
    }
    return super.onOptionsItemSelected(item);
}