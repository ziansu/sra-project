@java.lang.Override
public void onResponse(retrofit2.Call<com.namclu.android.deputyscheduler.models.ShiftResponse> call, retrofit2.Response<com.namclu.android.deputyscheduler.models.ShiftResponse> response) {
    int statusCode = response.code();
    java.util.List<com.namclu.android.deputyscheduler.models.Shift> shifts = response.body().getShifts();
    recyclerView.setAdapter(new com.namclu.android.deputyscheduler.adapters.ShiftAdapter(shifts));
}