@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    if ((userIsLoggedIn) == true) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }else {
        getMenuInflater().inflate(R.menu.about_us, menu);
        return true;
    }
}