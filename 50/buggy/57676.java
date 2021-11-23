public com.wireless.pojo.promotion.Coupon.IssueBuilder addPromotion(int promotionId) {
    if (!(promotions.containsElement(promotionId))) {
        promotions.add(promotionId);
    }
    return this;
}