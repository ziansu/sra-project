public void addDiscount(com.wireless.pojo.distMgr.Discount discount) {
    if ((discount != null) && (!(discounts.contains(discount)))) {
        discounts.add(discount);
    }
}