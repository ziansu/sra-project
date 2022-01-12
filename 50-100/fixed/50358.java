@java.lang.Override
public void onClick(android.view.View v) {
    problem_number = 3;
    tinydb.putInt("problem_number", problem_number);
    android.support.v4.app.ActivityOptionsCompat options = android.support.v4.app.ActivityOptionsCompat.makeSceneTransitionAnimation(this);
    android.content.Intent intent = new android.content.Intent(this, com.chrisgaddes.reaction.SecondActivity.class);
    startActivity(intent, options.toBundle());
}