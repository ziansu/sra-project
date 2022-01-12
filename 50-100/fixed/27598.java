public void onClick(android.content.DialogInterface dialog, int id) {
    java.util.ArrayList<ru.elegion.weathercaster_mark_one.models.City> newCities = new java.util.ArrayList<ru.elegion.weathercaster_mark_one.models.City>();
    ru.elegion.weathercaster_mark_one.models.City newCity = new ru.elegion.weathercaster_mark_one.models.City();
    newCity.setName(input.getText().toString());
    newCities.add(newCity);
    ru.elegion.weathercaster_mark_one.ui.activities.CityListActivity.AddCityTask addCityTask = new ru.elegion.weathercaster_mark_one.ui.activities.CityListActivity.AddCityTask();
    addCityTask.execute(newCities);
}