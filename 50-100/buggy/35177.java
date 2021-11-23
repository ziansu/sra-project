private static org.apache.ignite.tests.pojos.ProductOrder generateRandomOrder(long productId, int saltedNumber) {
    java.util.Calendar cl = java.util.Calendar.getInstance();
    cl.set(java.util.Calendar.YEAR, org.apache.ignite.tests.utils.TestsHelper.ORDERS_YEAR);
    cl.set(java.util.Calendar.MONTH, org.apache.ignite.tests.utils.TestsHelper.ORDERS_MONTH);
    cl.set(java.util.Calendar.DAY_OF_MONTH, org.apache.ignite.tests.utils.TestsHelper.ORDERS_DAY);
    long orderId = java.lang.Long.parseLong((((java.lang.System.currentTimeMillis()) + (org.apache.ignite.tests.utils.TestsHelper.HOST_PREFIX)) + saltedNumber));
    return org.apache.ignite.tests.utils.TestsHelper.generateRandomOrder(productId, orderId, cl.getTime());
}