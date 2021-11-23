public static synchronized android.database.sqlite.SQLiteDatabase open() throws android.database.SQLException {
    (net.polybugger.apollot.db.ApolloDbAdapter.sOpenCounter)++;
    if ((net.polybugger.apollot.db.ApolloDbAdapter.sOpenCounter) == 1) {
        net.polybugger.apollot.db.ApolloDbAdapter.sDb = net.polybugger.apollot.db.ApolloDbAdapter.sDbHelper.getWritableDatabase();
    }
    return net.polybugger.apollot.db.ApolloDbAdapter.sDb;
}