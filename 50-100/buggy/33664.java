@java.lang.Override
public void applyLocation(org.omnirom.omnijaws.WeatherInfo.WeatherLocation result) {
    org.omnirom.omnijaws.Config.setLocationId(this, result.id);
    org.omnirom.omnijaws.Config.setLocationName(this, result.city);
    mLocation.setText(result.city);
    mLocation.setSummary(result.city);
    org.omnirom.omnijaws.WeatherService.startUpdate(this, true);
}