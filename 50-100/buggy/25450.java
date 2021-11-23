public void startGameActivity(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(view.getContext(), io.exis.cards.cards.GameActivity.class);
    intent.putExtra("key_screen_name", screenName);
    if ((android.os.Build.VERSION.SDK_INT) >= 21) {
        view.getContext().startActivity(intent, android.app.ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }else {
        view.getContext().startActivity(intent);
    }
}