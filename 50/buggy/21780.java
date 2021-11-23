@java.lang.Override
public void onResponse(retrofit2.Call<userregistration.gearvr.visa.com.userregistration.Model.User> call, retrofit2.Response<userregistration.gearvr.visa.com.userregistration.Model.User> response) {
    android.util.Log.d("service_call", response.toString());
    android.widget.Toast.makeText(getApplicationContext(), "Successful response", Toast.LENGTH_SHORT).show();
}