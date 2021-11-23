public static synchronized database.DatabaseConnection getInstance(android.content.Context context) {
    if ((database.DatabaseConnection.myInstance) == null) {
        if ((database.DatabaseConnection.myContext) == null) {
            database.DatabaseConnection.myInstance = new database.DatabaseConnection(context);
        }else {
            database.DatabaseConnection.myInstance = new database.DatabaseConnection(database.DatabaseConnection.myContext);
        }
    }
    return database.DatabaseConnection.myInstance;
}