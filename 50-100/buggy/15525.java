@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((recipes) == null) {
        android.widget.Toast.makeText(getApplicationContext(), "I've missunderstood :(", Toast.LENGTH_LONG).show();
    }
    if (!(hasPlayedSplash)) {
        android.content.Intent intent = new android.content.Intent(this, nu.geeks.coffeekeeper.SplashScreen.class);
        startActivityForResult(intent, splashRequestCode);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }
    recipeAdapter.notifyDataSetChanged();
}