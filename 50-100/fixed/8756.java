private static double getPassangerDiscount(ooptraining.Passanger p) {
    double discount = 1.0;
    if ((p.getMiles()) > (ooptraining.DiscountCalculator.GOLD_LIMIT)) {
        discount = ooptraining.DiscountCalculator.GOLD_DISCOUNT;
    }else
        if ((p.getMiles()) > (ooptraining.DiscountCalculator.SILVER_LIMIT)) {
            discount = ooptraining.DiscountCalculator.SILVER_DISCOUNT;
        }
    
    return discount;
}