public void addDiscount(com.wireless.pojo.distMgr.Discount discount) {
    if (!(discounts.contains(discount))) {
        discounts.add(discount);
    }
}