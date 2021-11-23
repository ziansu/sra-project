public final void addToList(final com.aero.control.helpers.PerApp.AppMonitor.AppContext context) {
    if (existsContext(context)) {
        com.aero.control.helpers.PerApp.AppMonitor.AppLogger.print(mClassName, (("App: " + (context.getAppName())) + " already added."), 1);
        return ;
    }
    mAppList.add(context);
    com.aero.control.helpers.PerApp.AppMonitor.AppLogger.print(mClassName, (("App: " + (context.getAppName())) + " successfully added!"), 1);
}