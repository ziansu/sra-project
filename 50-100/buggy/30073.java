@java.lang.Override
public java.util.List<co.in.mobilepay.entity.PurchaseEntity> getOrderStatusList() throws java.sql.SQLException {
    java.util.List<co.in.mobilepay.entity.PurchaseEntity> test = purchaseDao.queryForAll();
    com.j256.ormlite.stmt.QueryBuilder<co.in.mobilepay.entity.PurchaseEntity, java.lang.Integer> luggageQueryBuilder = purchaseDao.queryBuilder();
    luggageQueryBuilder.where().eq(PurchaseEntity.PAYMENT_STATUS, PaymentStatus.PAIED).and().ne(PurchaseEntity.ORDER_STATUS, OrderStatus.CANCELLED).and().ne(PurchaseEntity.ORDER_STATUS, OrderStatus.DELIVERED);
    luggageQueryBuilder = luggageQueryBuilder.orderBy(PurchaseEntity.UPDATED_DATE_TIME, false);
    java.lang.String temp = luggageQueryBuilder.prepareStatementString();
    return luggageQueryBuilder.query();
}