@java.lang.Override
public void onResponse(retrofit2.Call<metro.ourthingsee.RESTObjects.Events> call, retrofit2.Response<metro.ourthingsee.RESTObjects.Events> response) {
    metro.ourthingsee.Utils.handleOnResponse(response, prefs);
    updateDisplayTV(getContext());
}