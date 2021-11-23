@java.lang.Override
public void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    for (int i : appWidgetIds) {
        updateWidget(context, appWidgetManager, i);
    }
    android.util.Log.d(com.example.ilya.gb_android2_les5_notewidget.widget.WidgetProvider.TAG, "onUpdate: ");
    super.onUpdate(context, appWidgetManager, appWidgetIds);
}