@java.lang.Override
protected void onPostExecute(com.example.jake.commutilator.Vehicles.FuelPriceData fuelPriceData) {
    super.onPostExecute(fuelPriceData);
    textView.setText(fuelPriceData.regular.toString());
}