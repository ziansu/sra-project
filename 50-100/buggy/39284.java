@java.lang.Override
public void onClick(android.view.View v) {
    finalCountdown.cancel();
    userScores();
    android.content.Intent myIntent = new android.content.Intent(this, com.example.android.sailingquiz.MainActivity.class);
    myIntent.putExtra("score", score);
    this.startActivity(myIntent);
    finish();
}