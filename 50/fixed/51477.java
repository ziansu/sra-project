@java.lang.Override
public void onSuccess(com.arao.simpleweather.data.entity.City result) {
    results.add(result);
    if ((results.size()) > 1) {
        java.util.Collections.sort(results);
    }
    homeView.displayWeatherForCities(results);
}