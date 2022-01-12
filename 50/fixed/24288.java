@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    android.widget.Toast.makeText(this, getResources().getString(R.string.serverError), Toast.LENGTH_SHORT).show();
}