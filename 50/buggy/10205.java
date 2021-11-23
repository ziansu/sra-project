@java.lang.Override
public void onFailure(com.parse.ParseException exception) {
    android.util.Log.d("zzz-makeReservation", ("get available machine fail " + (exception.getMessage())));
    callback.onFailure(exception);
}