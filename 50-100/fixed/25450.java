public void startGameActivity(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(view.getContext(), io.exis.cards.cards.GameActivity.class);
    intent.putExtra("key_screen_name", screenName);
    view.getContext().startActivity(intent);
    if ((android.os.Build.VERSION.SDK_INT) >= 21) {
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}