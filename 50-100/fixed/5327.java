private static void redrawWidgets(android.content.Context context) {
    com.rmnoon.workflowy.app.WFModel.getInstance(context).ensureAppWidgets(com.google.common.primitives.Ints.asList(getAppWidgetIds(context)));
    notifyListItemsChanged(context);
    for (int appWidgetId : getAppWidgetIds(context)) {
        com.rmnoon.workflowy.app.WorkflowyListWidget.drawWidget(context, appWidgetId);
    }
}