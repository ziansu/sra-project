@java.lang.Override
public void call(com.joe.holi.data.model.AccuLocation accuLocation) {
    prepareCity((((accuLocation.getLocalizedName()) + "#") + (accuLocation.getKey())));
    requestWeatherData(false);
}