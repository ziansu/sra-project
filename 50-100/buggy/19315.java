@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.view.MenuInflater inflater = getMenuInflater();
    if (mFirebaseAuth.getCurrentUser().isAnonymous()) {
        inflater.inflate(R.menu.anonymous_main_menu, menu);
    }else {
        inflater.inflate(R.menu.main_menu, menu);
    }
    return true;
}