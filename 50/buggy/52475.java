public void onCreate() {
    super.onCreate();
    com.colossaldb.dnd.MyApp.context = getApplicationContext();
    com.colossaldb.dnd.prefs.AppPreferences.initialize(com.colossaldb.dnd.MyApp.context);
}