@java.lang.Override
public void showCurrentWeatherScreen(long cityId) {
    showScreen(info.eivanov.weatherforecastr.fragments.ViewCurrentWeatherFragment.newInstance(cityId), ViewCurrentWeatherFragment.TAG, true);
}