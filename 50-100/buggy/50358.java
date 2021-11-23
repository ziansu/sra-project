@java.lang.Override
public void onClick(android.view.View v) {
    problem_number = 3;
    part_letter = "A";
    tinydb.putInt("problem_number", problem_number);
    tinydb.putString("part_letter", part_letter);
    android.support.v4.app.ActivityOptionsCompat options = android.support.v4.app.ActivityOptionsCompat.makeSceneTransitionAnimation(this);
    android.content.Intent intent = new android.content.Intent(this, com.chrisgaddes.reaction.SecondActivity.class);
    startActivity(intent, options.toBundle());
}