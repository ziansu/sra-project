public static java.lang.String commaSeparatedIds(java.util.List<models.Coupon> coupons) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (models.Coupon c : coupons) {
        sb.append(c.id).append(",");
    }
    sb.deleteCharAt(((sb.length()) - 1));
    return sb.toString();
}