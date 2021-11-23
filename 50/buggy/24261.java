@java.lang.Override
public void onResponse(retrofit2.Response<com.example.sidneysmall.finalproject121.response.SchedulePost> response) {
    if ((response.body().response.compareTo("ok")) == 0) {
        android.util.Log.d("DEBUG", "Should be calling getSchedule here");
        getSchedule();
    }
}