@java.lang.Override
public void onBackPressed() {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra("index", dataIndex);
    intent.putExtra("check", toggleCheck);
    setResult(com.brothers.travelplanner.activities.priceplan.hotel.RESULT_OK, intent);
    finish();
    if (toggleCheck) {
        mcontext.setHotelAddress(hotelAddress);
        mcontext.sethotelName(hotelName);
        mcontext.sethotelLocation(hotelLocation);
    }
    super.onBackPressed();
}