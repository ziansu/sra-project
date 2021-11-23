public boolean onOptionsItemSelected(android.view.MenuItem item) {
    try {
        c.close();
        finish();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return true;
}