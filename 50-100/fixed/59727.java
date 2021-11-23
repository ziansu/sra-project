@java.lang.Override
public java.util.List<java.lang.String> getFieldNames(java.lang.Class<? extends io.realm.RealmModel> clazz) {
    checkClass(clazz);
    if (clazz.equals(com.xstock.models.UserDetail.class)) {
        return io.realm.io.realm.UserDetailRealmProxy.getFieldNames();
    }else
        if (clazz.equals(com.xstock.models.GetTradeList.class)) {
            return io.realm.io.realm.GetTradeListRealmProxy.getFieldNames();
        }else {
            throw getMissingProxyClassException(clazz);
        }
    
}