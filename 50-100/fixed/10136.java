@java.lang.Override
public void onResponse(retrofit2.Call<java.util.List<com.namclu.android.deputyscheduler.models.Shift>> call, retrofit2.Response<java.util.List<com.namclu.android.deputyscheduler.models.Shift>> response) {
    int statusCode = response.code();
    java.util.List<com.namclu.android.deputyscheduler.models.Shift> shifts = response.body();
    recyclerView.setAdapter(new com.namclu.android.deputyscheduler.adapters.ShiftAdapter(shifts));
}