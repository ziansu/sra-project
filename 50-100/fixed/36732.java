private static java.lang.String makeSql(com.wireless.pojo.staffMgr.Staff staff, com.wireless.db.billStatistics.CalcCouponStatisticsDao.ExtraCond extraCond) {
    java.lang.String sql;
    sql = (((((((((" SELECT CO.coupon_name, CO.coupon_price, C.coupon_type_id " + " FROM ") + (com.wireless.db.Params.dbName)) + ".coupon_operation CO ") + " LEFT JOIN ") + (com.wireless.db.Params.dbName)) + ".coupon C ON CO.coupon_id = C.coupon_id ") + " WHERE 1 = 1 ") + " AND CO.restaurant_id = ") + (staff.getRestaurantId())) + (extraCond != null ? extraCond.toString() : "");
    return sql;
}