@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (-1)) {
        com.faa1192.weatherforecast.Cities.City city = com.faa1192.weatherforecast.Cities.City.fromBundle(data.getExtras());
        android.widget.Toast.makeText(this, ((getResources().getString(R.string.added_city)) + (city.name)), Toast.LENGTH_SHORT).show();
        this.update();
    }
}