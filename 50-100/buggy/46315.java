@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (!(isOnline())) {
        android.util.Log.i("MyMapsActivity", "!isOnline()");
        android.content.Intent intent = new android.content.Intent(getApplicationContext(), clearfaun.com.pokebuspro.NoConnectionActivity.class);
        startActivity(intent);
        this.finish();
    }else {
        android.content.Intent intent = new android.content.Intent(getApplicationContext(), clearfaun.com.pokebuspro.MainActivity.class);
        startActivity(intent);
        this.finish();
    }
    return true;
}