@java.lang.Override
public void run() {
    android.content.Intent mainIntent = new android.content.Intent(this, com.bquiet.bquiet.activities.MainActivity.class);
    startActivity(mainIntent);
    this.finish();
}