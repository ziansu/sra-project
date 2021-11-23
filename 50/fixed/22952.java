@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent gameStartActivity = new android.content.Intent(this, com.guessgame.akwag.myapplication.GameStartActivity.class);
    startActivity(gameStartActivity);
    overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
}