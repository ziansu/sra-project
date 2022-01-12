public static synchronized android.database.sqlite.SQLiteDatabase open() throws android.database.SQLException {
    if ((net.polybugger.apollot.db.ApolloDbAdapter.sOpenCounter) == 0)
        net.polybugger.apollot.db.ApolloDbAdapter.sDb = net.polybugger.apollot.db.ApolloDbAdapter.sDbHelper.getWritableDatabase();
    
    (net.polybugger.apollot.db.ApolloDbAdapter.sOpenCounter)++;
    return net.polybugger.apollot.db.ApolloDbAdapter.sDb;
}