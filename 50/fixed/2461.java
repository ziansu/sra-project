@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    android.util.Log.e("Error", "That didn't work!");
    android.widget.Toast.makeText(getApplicationContext(), "Error connecting to server please try again.", Toast.LENGTH_LONG).show();
}