@java.lang.Override
public void onResponse(retrofit2.Call<java.lang.Boolean> call, retrofit2.Response<java.lang.Boolean> response) {
    if (!(response.isSuccessful())) {
        int statusCode = response.code();
        android.util.Log.e("MainActivity", ("Response not successful. Status code: " + statusCode));
        android.widget.Toast.makeText(getContext(), "Error in approving friend request.", Toast.LENGTH_LONG).show();
        return ;
    }
    android.widget.Toast.makeText(getContext(), "Friend request approved.", Toast.LENGTH_LONG).show();
}