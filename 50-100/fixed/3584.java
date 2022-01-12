@java.lang.Override
public void onClick(android.view.View v) {
    problem_number = 1;
    tinydb.putInt("problem_number", problem_number);
    android.support.v4.app.ActivityOptionsCompat options = android.support.v4.app.ActivityOptionsCompat.makeSceneTransitionAnimation(this);
    android.content.Intent intent = new android.content.Intent(this, com.chrisgaddes.reaction.SecondActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
    startActivity(intent, options.toBundle());
}