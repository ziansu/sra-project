private void exitWithError() {
    android.widget.Toast.makeText(baseContext, "There was an error initialising the decompiler with the app you selected.", Toast.LENGTH_LONG).show();
    finish();
    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
}