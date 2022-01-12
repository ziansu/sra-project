public static java.lang.String calculateDiscountPercent(android.content.Context context, double price, double discountPrice) {
    int percent = ((int) (100 - ((discountPrice / price) * 100)));
    return java.lang.String.format(context.getString(R.string.format_price_discount_percents), percent);
}