@java.lang.Override
public io.realm.internal.ColumnInfo validateTable(java.lang.Class<? extends io.realm.RealmModel> clazz, io.realm.internal.ImplicitTransaction transaction) {
    checkClass(clazz);
    if (clazz.equals(com.xstock.models.GetTradeList.class)) {
        return io.realm.io.realm.GetTradeListRealmProxy.validateTable(transaction);
    }else
        if (clazz.equals(com.xstock.models.GetUserProduct.class)) {
            return io.realm.io.realm.GetUserProductRealmProxy.validateTable(transaction);
        }else
            if (clazz.equals(com.xstock.models.UserDetail.class)) {
                return io.realm.io.realm.UserDetailRealmProxy.validateTable(transaction);
            }else {
                throw getMissingProxyClassException(clazz);
            }
        
    
}