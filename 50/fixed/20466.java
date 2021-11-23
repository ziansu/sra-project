@java.lang.Override
protected void onPostExecute(com.example.jake.commutilator.Vehicles.FuelPriceData fuelPriceData) {
    if (fuelPriceData != null) {
        textView.setText(fuelPriceData.regular.toString());
    }
}