@java.lang.Override
public void onClick(android.view.View v) {
    service.refreshWeather(("" + (fieldCity.getText())));
}