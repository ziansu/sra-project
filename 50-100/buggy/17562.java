@java.lang.Override
public java.math.BigDecimal listCommoditiesAmount(java.lang.String identifier, java.lang.String name, java.lang.String mobile, java.util.List<java.lang.String> cellNames, java.util.List<com.gezipu360.common.entity.sell.store.Store> storeList) {
    return commodityDao.listCommoditiesAmount(identifier, name, mobile, cellNames, storeList).setScale(2, java.math.BigDecimal.ROUND_HALF_UP);
}