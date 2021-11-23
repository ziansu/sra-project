public static synchronized com.dm.wallpaper.board.databases.Database getInstance(@android.support.annotation.NonNull
android.content.Context context) {
    if ((com.dm.wallpaper.board.databases.Database.mDatabase) == null) {
        com.dm.wallpaper.board.databases.Database.mDatabase = new com.dm.wallpaper.board.databases.Database(context.getApplicationContext());
    }
    return com.dm.wallpaper.board.databases.Database.mDatabase;
}