@java.lang.Override
public boolean onError() {
    android.widget.Toast.makeText(this, "Error playing stream", Toast.LENGTH_SHORT).show();
    android.widget.Toast.makeText(this, "Error playing stream", Toast.LENGTH_SHORT).show();
    resetMediaPlayer();
    initMediaPlayer();
    resetButtons();
    if ((getSupportActionBar()) != null) {
        getSupportActionBar().setTitle(getResources().getString(R.string.app_name));
    }
    return false;
}