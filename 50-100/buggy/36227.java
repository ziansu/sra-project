public static double countGoodDiscount(code.Good good, int num) {
    double discountFee = 0.0;
    boolean hasDiscounted = false;
    if (discountFee == (util.Discount.getDiscountFea(good, num, DiscountGood.buy_two_free_one_discount))) {
        hasDiscounted = true;
    }
    if (!hasDiscounted) {
        discountFee = util.Discount.getDiscountFea(good, num, DiscountGood.five_percent_discount);
    }
    return discountFee;
}