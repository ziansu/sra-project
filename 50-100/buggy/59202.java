@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    apiKey = etApiInput.getText().toString();
    android.util.Log.d(com.example.android.popularmovies.MainActivity.TAG, ("requestApi.onClick() returned: " + (apiKey)));
    if (((apiKey) != null) && (!(apiKey.equals("")))) {
        android.util.Log.d(com.example.android.popularmovies.MainActivity.TAG, "requestApi.onClick: was called");
        getMovies();
    }else {
    }
}