@java.lang.Override
public void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    this.mContext = context;
    this.mAppWidgetIds = appWidgetIds.clone();
    this.mAppWidgetManager = appWidgetManager;
    updateWidget();
    android.util.Log.d(com.example.ilya.gb_android2_les5_notewidget.widget.WidgetProvider.TAG, "onUpdate: ");
    super.onUpdate(context, appWidgetManager, appWidgetIds);
}