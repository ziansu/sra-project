public static java.lang.String calculateDiscountPercent(android.content.Context context, double price, double discountPrice) {
    int percent;
    if (discountPrice >= price) {
        percent = 0;
    }else {
        percent = ((int) (java.lang.Math.round((100 - ((discountPrice / price) * 100)))));
    }
    return java.lang.String.format(context.getString(R.string.format_price_discount_percents), percent);
}