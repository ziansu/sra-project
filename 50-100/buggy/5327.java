private static void redrawWidgets(android.content.Context context) {
    com.rmnoon.workflowy.app.WFModel model = com.rmnoon.workflowy.app.WFModel.getInstance(context);
    android.util.Log.i(com.rmnoon.workflowy.app.WorkflowyListWidget.TAG, ("redrawWidgets: " + (model.toString())));
    model.ensureAppWidgets(com.google.common.primitives.Ints.asList(getAppWidgetIds(context)));
    notifyListItemsChanged(context);
    for (int appWidgetId : getAppWidgetIds(context)) {
        com.rmnoon.workflowy.app.WorkflowyListWidget.drawWidget(context, appWidgetId);
    }
}