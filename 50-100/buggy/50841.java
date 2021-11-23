@java.lang.Override
public void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    super.onUpdate(context, appWidgetManager, appWidgetIds);
    com.jianhui_zhu.simpleweatherwidget.dagger.DaggerAPIComponent.builder().aPIModule(new com.jianhui_zhu.simpleweatherwidget.dagger.APIModule()).build().inject(this);
    if ((viewModel) == null) {
        android.util.Log.d(getClass().getSimpleName(), "viewmodel is null");
    }
    viewModel.initSetting(context, appWidgetManager, appWidgetIds);
    broadcastBriefWeatherUpdateRequest(context);
}