@java.lang.Override
public void run() {
    android.widget.Toast.makeText(getApplicationContext(), "Couldn't get json from server. Check LogCat for possible errors!", Toast.LENGTH_LONG).show();
    return ;
}