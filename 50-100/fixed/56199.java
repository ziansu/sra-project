@java.lang.Override
protected void start() {
    try {
        com.imesong.springdream.database.AssetsDatabaseManager.getInstance(context).initLoacalDatabase(AssetsDatabaseManager.DB_NAME);
    } catch (java.lang.NoSuchFieldException e) {
        e.printStackTrace();
        com.imesong.springdream.utils.EventAgentUtil.reportError(context, e);
    } catch (java.io.IOException e) {
        e.printStackTrace();
        com.imesong.springdream.utils.EventAgentUtil.reportError(context, e);
    }
}