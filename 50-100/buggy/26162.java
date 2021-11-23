private void updateButtonText(java.lang.String updatedState) {
    android.widget.RemoteViews views = new android.widget.RemoteViews(context.getPackageName(), R.layout.garage_opener_widget);
    views.setTextViewText(R.id.widget_button_garage_opener, updatedState);
    views.setTextViewTextSize(R.id.widget_button_garage_opener, TypedValue.COMPLEX_UNIT_SP, 12);
    android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context);
    appWidgetManager.updateAppWidget(widgetIds, views);
    if (notify) {
        uk.echosoft.garage.opener.GarageOpenerWidget.notificationStateChange(context, ("Garage " + (uk.echosoft.garage.opener.Language.convertAdjectiveToOppositeVerb(updatedState))));
    }
}