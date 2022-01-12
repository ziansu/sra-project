@java.lang.Override
public void onResponse(retrofit2.Call<com.example.thomas.veggiehero.Data.User> call, retrofit2.Response<com.example.thomas.veggiehero.Data.User> response) {
    com.example.thomas.veggiehero.Data.User u = response.body();
    if (u != null) {
        currentUser = u;
        succes[0] = true;
    }else {
        succes[0] = true;
    }
}