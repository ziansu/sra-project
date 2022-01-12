@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.changeName :
            try {
                java.io.File prefsFile = new java.io.File("/data/data/se.chalmers.eda397.team9.cardsagainsthumanity/shared_prefs/usernameFile.xml");
                prefsFile.delete();
            } catch (java.lang.Exception e) {
            }
            android.content.Intent intent = new android.content.Intent(this, se.chalmers.eda397.team9.cardsagainsthumanity.IndexActivity.class);
            startActivity(intent);
            return true;
        case R.id.changeTable :
            return true;
        case R.id.settings :
            return true;
        case R.id.help :
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}