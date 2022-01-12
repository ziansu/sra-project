@java.lang.Override
public void enablePackage(long orderId) {
    java.lang.String sql = "UPDATE SG_SubjectOrderPackage SET Status=1 WHERE OrderId=?";
    int updateCount = singleUpdate(sql, new java.lang.Object[]{ orderId });
    if (!(updateCount > 0))
        throw new java.lang.RuntimeException(("fail to enable package of order: " + orderId));
    
}