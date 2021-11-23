@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    double price = new com.carpooler.trips.FuelPrice().getFuelUnitPrice(geoPoint);
    android.util.Log.i("Trip", ("fuelPrice: " + price));
    tripData.setFuelPrice(price);
    return null;
}