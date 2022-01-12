@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent challengeDetailIntent = new android.content.Intent(context, com.example.vikramjeet.challengerapp.activities.CompletedChallengeDetailActivity.class);
    java.lang.String position = ((java.lang.String) (tvTitle.getTag()));
    challengeDetailIntent.putExtra(CompletedChallengeDetailActivity.EXTRA_OPEN_CHALLENGE_ID, position);
    context.startActivity(challengeDetailIntent);
    ((android.app.Activity) (context)).overridePendingTransition(R.anim.right_in, R.anim.left_out);
}