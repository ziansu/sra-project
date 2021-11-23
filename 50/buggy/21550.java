public void onClickHome(android.view.View view) {
    android.util.Log.e(nl.mprog.ghost.GameActivity.TAG, "clicked home?");
    android.content.Intent intent = new android.content.Intent(this, nl.mprog.ghost.MainActivity.class);
    startActivity(intent);
}