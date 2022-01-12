public void startNameActivity(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, io.exis.cards.cards.NameActivity.class);
    intent.putExtra("screenName", screenName);
    if ((android.os.Build.VERSION.SDK_INT) >= 21) {
        startActivityForResult(intent, 1, android.app.ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }else {
        startActivityForResult(intent, 1);
    }
}