public com.uf.rest.entity.ShopVisitRecord findOneDayVisitRecord(java.lang.Integer shopId, java.util.Date date) {
    java.util.List<com.uf.rest.entity.ShopVisitRecord> records = shopVisitDao.findByHql("select v from ShopVisitRecord v where v.shop.id=? and v.date>=? and v.date<=? ", shopId, com.uf.rest.util.DateUtil.getDateBegin(date), com.uf.rest.util.DateUtil.getDateEnd(date));
    if (records != null) {
        return records.get(0);
    }
    return null;
}