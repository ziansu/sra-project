@java.lang.Override
public void call(com.joe.holi.data.model.AccuLocation accuLocation) {
    if (accuLocation == null) {
        return ;
    }
    prepareCity((((accuLocation.getLocalizedName()) + "#") + (accuLocation.getKey())));
    requestWeatherData(false);
}