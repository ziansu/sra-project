public static void main(java.lang.String[] argv) throws java.lang.Exception {
    axel.tkp.forum.database.Database database = new axel.tkp.forum.database.Database(axel.tkp.forum.util.Constants.POSTGRES_URL);
    if (axel.tkp.forum.util.Constants.createTables) {
        axel.tkp.forum.Forum.createPostgreTables(database.getConnection());
    }
    staticFileLocation("public");
    axel.tkp.forum.util.RequestBinder.init(database);
    init();
}