public com.wireless.pojo.promotion.Coupon.IssueBuilder addPromotion(com.wireless.pojo.promotion.Promotion promotion) {
    if (!(promotions.containsElement(promotion.getId()))) {
        promotions.add(promotion.getId());
    }
    return this;
}