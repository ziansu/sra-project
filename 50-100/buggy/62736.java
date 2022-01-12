private void payOrder(long orderId) {
    java.lang.String sql = "UPDATE SG_SubjectOrder SET Status=? WHERE Id=? AND Status=?";
    int updateCount = singleUpdate(sql, new java.lang.Object[]{ Order.Status.PAYED , orderId , Order.Status.PRE_PAYED });
    if (updateCount != 1)
        throw new java.lang.RuntimeException(("fail to pay order: " + orderId));
    
}