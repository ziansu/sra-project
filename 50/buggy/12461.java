@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.i("IGOR", "MAIN - on STOP");
    popcorp.robopop.MainActivity.stopAll(this);
    startActivity(startupIntent);
}