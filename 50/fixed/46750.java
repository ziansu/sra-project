@java.lang.Override
public void onDoneButtonClick(android.support.v4.app.DialogFragment dialog) {
    android.content.Intent intent = new android.content.Intent(this, com.tonyblake.songmojo.Home.class);
    intent.putExtra("firstName", user);
    startActivity(intent);
}