@java.lang.Override
public void applyLocation(org.omnirom.omnijaws.WeatherInfo.WeatherLocation result) {
    org.omnirom.omnijaws.Config.setLocationId(getContext(), result.id);
    org.omnirom.omnijaws.Config.setLocationName(getContext(), result.city);
    setText(result.city);
    mDialog.dismiss();
    setSummary(result.city);
    org.omnirom.omnijaws.WeatherService.startUpdate(getContext());
}