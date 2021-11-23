private void loadWidgets() {
    widgetIds = com.appbar.matocham.applicationbar.widget.AppBarWidgetService.getAppWidgetIds(this);
    if ((widgetIds.length) > 0) {
        new com.appbar.matocham.applicationbar.asuncTasks.LoadAppsAsyncTask(this, handler, true).execute();
        com.appbar.matocham.applicationbar.applicationManager.WidgetAppsManager.loadWidgets(this);
        com.appbar.matocham.applicationbar.widget.AppBarWidgetService.updateWidget(this);
    }else {
        item.setVisible(false);
        invalidateOptionsMenu();
    }
}