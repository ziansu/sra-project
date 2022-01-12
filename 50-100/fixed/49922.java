@java.lang.SuppressWarnings(value = "deprecation")
public void init() {
    configurationReader = com.excel.configuration.ConfigurationReader.getInstance();
    initViews();
    tv_collar_text.setText("Tier Bar and Rooms at Sanctuary Block are undergoing renovation and should be progressively completed by August 2016.");
    tv_collar_text.startScroll();
    setLauncherMenuItems();
    createLauncheritemsUpdateBroadcast();
    startPerfectTimeService();
    createPerfectTimeReceiver();
    startClockTicker();
    startDateAndDayNameSwitcher();
    startYahooWeatherService();
    createYahooWeatherReceiver();
    startScreenCastService();
}