@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.e("reserve", "click");
    reservationPresenter.getLodgingList("list", itineraryData.getItineraryLodgingCity().get((position + 1)).getCityId(), tools.Util.getTokenFromSharedPreferences(getApplicationContext()), "20", "0", tools.Util.getAndroidIdFromSharedPreferences(getApplicationContext()), "");
}