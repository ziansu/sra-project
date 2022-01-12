@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.e("reserve", "click");
    reservationPresenter.getLodgingList("list", itineraryData.getItineraryLodgingCity().get((position + 1)).getCityId(), "20", "0", tools.Util.getTokenFromSharedPreferences(getApplicationContext()), tools.Util.getAndroidIdFromSharedPreferences(getApplicationContext()), "");
}