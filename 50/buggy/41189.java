private void exitActivity() {
    android.util.Log.i(LOG, "Returning to MainActivity...");
    startActivity(new android.content.Intent(this, net.kenneho.runnow.MainActivity.class));
    finish();
}