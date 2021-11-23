public static boolean updatePayment(band.wukong.mz.g.customer.bean.Customer c) {
    return ((null != c) && ((c.getId()) > 0)) && ((c.getPaymentClothing()) >= 0);
}