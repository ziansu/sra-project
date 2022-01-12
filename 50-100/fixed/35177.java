private static org.apache.ignite.tests.pojos.ProductOrder generateRandomOrder(long productId, int saltedNumber) {
    java.util.Calendar cl = java.util.Calendar.getInstance();
    cl.set(java.util.Calendar.YEAR, org.apache.ignite.tests.utils.TestsHelper.ORDERS_YEAR);
    cl.set(java.util.Calendar.MONTH, org.apache.ignite.tests.utils.TestsHelper.ORDERS_MONTH);
    cl.set(java.util.Calendar.DAY_OF_MONTH, org.apache.ignite.tests.utils.TestsHelper.ORDERS_DAY);
    long id = java.lang.Long.parseLong((((productId + (java.lang.System.currentTimeMillis())) + (org.apache.ignite.tests.utils.TestsHelper.HOST_PREFIX)) + saltedNumber));
    return org.apache.ignite.tests.utils.TestsHelper.generateRandomOrder(id, productId, cl.getTime());
}