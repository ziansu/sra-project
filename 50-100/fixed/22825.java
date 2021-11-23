@java.lang.Override
public void onItemClick(android.view.View view, final int position) {
    java.lang.String offset = "0";
    if ((resultReqCountList.get(position).getReservationReqStatus().getStatusCount()) != "0") {
        hotelReservationStatusListPresenter.getHotelReservationStatusList("req_user_list", "fa", tools.Util.getUseRIdFromShareprefrence(getApplicationContext()), java.lang.String.valueOf((position + 1)), "20", offset, tools.Util.getTokenFromSharedPreferences(getApplicationContext()), tools.Util.getAndroidIdFromSharedPreferences(getApplicationContext()));
    }
}