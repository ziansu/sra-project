public static java.lang.String commaSeparatedIds(java.util.List<models.Coupon> coupons) {
    if ((coupons.size()) < 1) {
        return null;
    }
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (models.Coupon c : coupons) {
        sb.append(c.id).append(",");
    }
    sb.deleteCharAt(((sb.length()) - 1));
    return sb.toString();
}