@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.weather :
            android.content.Intent alertsIntent = new android.content.Intent(this, com.example.android.weatherapp.activities.weather_activity.WeatherDetailsActivity.class);
            alertsIntent.putExtra("location", selectedLocation);
            alertsIntent.putExtra("latlng", latlng);
            startActivity(alertsIntent);
            return true;
        case R.id.search :
            android.content.Intent searchIntent = new android.content.Intent(this, com.example.android.weatherapp.activities.mainactivity.MainActivity.class);
            startActivity(searchIntent);
        default :
            return super.onOptionsItemSelected(item);
    }
}