public java.util.ArrayList<java.lang.Long> insertUsers(java.util.ArrayList<com.afodevelop.chronoschedule.model.User> users) throws com.afodevelop.chronoschedule.model.SQLiteException {
    if (initialized) {
        java.util.ArrayList<java.lang.Long> result = new java.util.ArrayList<>();
        openDb();
        db.execSQL(com.afodevelop.chronoschedule.controllers.sqliteControllers.SQLiteAssistant.DB_CLEAR_USERS);
        for (com.afodevelop.chronoschedule.model.User u : users) {
            result.add(putUser(u));
        }
        closeDb();
        return result;
    }else {
        throw new com.afodevelop.chronoschedule.model.SQLiteException("SQLiteAssistant still not initialized.");
    }
}