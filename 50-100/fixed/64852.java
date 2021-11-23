public void onResponse(retrofit2.Call<a2id40.thermostatapp.data.models.WeekProgramState> call, retrofit2.Response<a2id40.thermostatapp.data.models.WeekProgramState> response) {
    if (response.isSuccessful()) {
        mWeekProgramStateModel = response.body();
        mSwitchState = mWeekProgramStateModel.isWeekProgramOn();
        java.lang.Double a = getTemperatureInRange(mTargetTemperature, 0.0);
    }else {
        try {
            java.lang.String onResponse = response.errorBody().string();
        } catch (java.io.IOException e) {
        }
    }
}