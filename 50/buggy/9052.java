@java.lang.Override
public void run() {
    android.content.Intent newActivity = new android.content.Intent(this, com.itproject.android.androidtvsample.ListActivity.class);
    newActivity.putExtra("UNAME", username);
    newActivity.putExtra("HOURS", numberofhours);
    finish();
    startActivity(newActivity);
}