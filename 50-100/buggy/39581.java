public static com.wireless.pojo.dishesOrder.Order.DiscountBuilder build4Member(int orderId, com.wireless.pojo.member.Member member, int discountId, int pricePlanId) {
    com.wireless.pojo.dishesOrder.Order.DiscountBuilder builder = new com.wireless.pojo.dishesOrder.Order.DiscountBuilder();
    builder.orderId = orderId;
    builder.memberId = member.getId();
    builder.discountId = (discountId <= 0) ? member.getMemberType().getDefaultDiscount().getId() : discountId;
    builder.pricePlanId = (pricePlanId <= 0) ? 0 : pricePlanId;
    return builder;
}