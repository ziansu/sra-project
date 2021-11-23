@java.lang.Override
public void onResponse(retrofit2.Call<java.util.List<tomsnuverink.com.workoutapp.model.Exercise>> call, retrofit2.Response<java.util.List<tomsnuverink.com.workoutapp.model.Exercise>> response) {
    android.util.Log.v("MAIN_ACTIVITY", response.body().toString());
    setAdapter(response.body());
}