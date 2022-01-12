@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.content.Intent intent = new android.content.Intent(this, com.example.andrea.starship_battle.Activities.MainActivity.class);
    android.os.Bundle b = new android.os.Bundle();
    b.putBoolean("new_window", true);
    intent.putExtras(b);
    shipFiringMediaPlayer.stop();
    shipResponseMediaPlayer.stop();
    finish();
    startActivity(intent);
}