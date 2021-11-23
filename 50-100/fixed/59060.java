private void getHotelResults(java.lang.String destination, java.lang.String selectId, java.lang.String typeOfHotel) {
    if ((destination != null) && (destination.equals("city"))) {
        reservationPresenter.getLodgingList("list", selectId, tools.Util.getTokenFromSharedPreferences(getContext()), "20", "0", tools.Util.getAndroidIdFromSharedPreferences(getContext()), typeOfHotel);
    }else {
        android.widget.Toast.makeText(getContext(), "شهر انتخاب شود", Toast.LENGTH_LONG).show();
    }
}