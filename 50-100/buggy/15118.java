public static void clearDatabase(android.content.Context context) {
    if (com.pischik.nikita.rssreader.RssDownload.hasConnect(context)) {
        com.nostra13.universalimageloader.core.ImageLoader.getInstance().clearDiskCache();
        com.nostra13.universalimageloader.core.ImageLoader.getInstance().clearMemoryCache();
        com.pischik.nikita.rssreader.DatabaseHelper databaseHelper = com.j256.ormlite.android.apptools.OpenHelperManager.getHelper(context, com.pischik.nikita.rssreader.DatabaseHelper.class);
        try {
            com.j256.ormlite.table.TableUtils.dropTable(databaseHelper.getConnectionSource(), com.pischik.nikita.rssreader.NewsItem.class, false);
            com.j256.ormlite.table.TableUtils.createTable(databaseHelper.getConnectionSource(), com.pischik.nikita.rssreader.NewsItem.class);
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
}