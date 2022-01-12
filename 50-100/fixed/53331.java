public static boolean productEligibleForPromotion(java.util.Map<java.lang.String, java.lang.Integer> cart, com.practise.tdd.Promotions promotion) {
    java.lang.String product = promotion.getProductSku();
    return (cart.containsKey(product)) && ((cart.get(product)) >= (promotion.geteligibleQuantity()));
}