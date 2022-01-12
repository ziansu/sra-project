protected com.swrve.sdk.localstorage.ILocalStorage createLocalStorage() {
    return new com.swrve.sdk.localstorage.SQLiteLocalStorage(context.get(), config.getDbName(), config.getMaxSqliteDbSize());
}