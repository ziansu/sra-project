public static com.wireless.pojo.dishesOrder.Order.DiscountBuilder build4Member(int orderId, com.wireless.pojo.member.Member member, int discountId, int pricePlanId) {
    com.wireless.pojo.dishesOrder.Order.DiscountBuilder builder = new com.wireless.pojo.dishesOrder.Order.DiscountBuilder();
    builder.orderId = orderId;
    builder.memberId = member.getId();
    builder.discountId = discountId;
    builder.pricePlanId = pricePlanId;
    return builder;
}