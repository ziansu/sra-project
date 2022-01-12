@java.lang.Override
public java.lang.String getTableName(java.lang.Class<? extends io.realm.RealmModel> clazz) {
    checkClass(clazz);
    if (clazz.equals(com.xstock.models.UserDetail.class)) {
        return io.realm.io.realm.UserDetailRealmProxy.getTableName();
    }else
        if (clazz.equals(com.xstock.models.GetTradeList.class)) {
            return io.realm.io.realm.GetTradeListRealmProxy.getTableName();
        }else {
            throw getMissingProxyClassException(clazz);
        }
    
}