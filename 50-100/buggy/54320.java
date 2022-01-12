public int calculateDeductions(com.codeclan.shoppingbasket.Customer customer, int totalSpend) {
    if ((customer.hasLoyaltyCard()) == false) {
        return 0;
    }else {
        double discount = (totalSpend / 100.0) * (this.percentageToDiscount);
        int intDiscount = ((int) (java.lang.Math.round(discount)));
        return intDiscount;
    }
}