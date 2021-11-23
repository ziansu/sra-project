public static com.tk_squared.varmint.tkkDataMod getInstance(android.app.Activity activity) {
    if ((com.tk_squared.varmint.tkkDataMod.instance) == null) {
        com.tk_squared.varmint.tkkDataMod.instance = new com.tk_squared.varmint.tkkDataMod();
        com.tk_squared.varmint.tkkDataMod.instance.stations = new java.util.ArrayList<>();
        com.tk_squared.varmint.tkkDataMod.instance._activity = activity;
        com.tk_squared.varmint.tkkDataMod.instance.dataSource = new com.tk_squared.varmint.tkkStationsDataSource(com.tk_squared.varmint.tkkDataMod.instance._activity.getApplicationContext());
        try {
            com.tk_squared.varmint.tkkDataMod.instance.dataSource.open();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        com.tk_squared.varmint.tkkDataMod.instance.populateStations();
    }
    return com.tk_squared.varmint.tkkDataMod.instance;
}