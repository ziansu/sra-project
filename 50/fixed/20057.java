@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    android.widget.Toast.makeText(this, "Failed !", Toast.LENGTH_LONG).show();
    android.widget.Toast.makeText(this, query, Toast.LENGTH_LONG).show();
}