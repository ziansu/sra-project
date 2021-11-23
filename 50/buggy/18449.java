@java.lang.Override
public void adapterrefresh(java.util.List<dev.eyesless.simple_weather_for_fishermans.weather_response_classes.Datum> mylist, boolean isdatanew) {
    cfinterface.adapterrefresh(mylist, isdatanew);
    android.util.Log.e("MY_TAG", ("refreshing adapter on presenter " + isdatanew));
}