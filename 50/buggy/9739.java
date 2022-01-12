@java.lang.Override
public void shutdown() throws au.com.mineauz.MobHunting.storage.DataStoreException {
    try {
        if ((mConnection) != null) {
            mConnection.close();
        }
    } catch (java.sql.SQLException e) {
        throw new au.com.mineauz.MobHunting.storage.DataStoreException(e);
    }
}