@java.lang.Override
public void onError() {
    android.util.Log.i(ru.sukharev.pathtracker.ui.MapActivity.TAG, "error!");
    android.widget.Toast.makeText(this, getString(R.string.error_saving_to_db), Toast.LENGTH_SHORT).show();
}