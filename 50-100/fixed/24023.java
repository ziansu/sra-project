@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.example.android.scorekeepdraft1.SetLineupActivity.class);
    android.os.Bundle b = new android.os.Bundle();
    b.putString("team", awayTeamSelection);
    intent.putExtras(b);
    startActivity(intent);
}