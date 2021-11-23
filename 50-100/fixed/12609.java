@java.lang.Override
public void onResponse(retrofit2.Call<io.caly.calyandroid.model.response.BasicResponse> call, retrofit2.Response<io.caly.calyandroid.model.response.BasicResponse> response) {
    io.caly.calyandroid.util.Logger.d(io.caly.calyandroid.activity.TAG, ("onResponse code : " + (response.code())));
    io.caly.calyandroid.util.Logger.d(io.caly.calyandroid.activity.TAG, ("param" + (io.caly.calyandroid.util.Util.requestBodyToString(call.request().body()))));
    switch (response.code()) {
        case 200 :
            break;
        default :
            com.crashlytics.android.Crashlytics.logException(new io.caly.calyandroid.exception.UnExpectedHttpStatusException(call, response));
            break;
    }
}