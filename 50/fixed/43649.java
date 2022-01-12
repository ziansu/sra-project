public static com.google.firebase.database.FirebaseDatabase getDatabase() {
    if ((it.unibo.studio.unigo.utils.Util.database) == null)
        it.unibo.studio.unigo.utils.Util.database = com.google.firebase.database.FirebaseDatabase.getInstance();
    
    return it.unibo.studio.unigo.utils.Util.database;
}