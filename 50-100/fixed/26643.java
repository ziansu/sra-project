public static java.lang.String convertGoodDataDateToString(java.lang.Number value) {
    org.joda.time.DateTime dt;
    try {
        int l = value.intValue();
        if (l == 0)
            return "";
        
        dt = com.gooddata.util.DateUtil.base.plusDays((l - 1));
    } catch (java.lang.NumberFormatException e) {
        return "";
    }
    return com.gooddata.util.DateUtil.baseFmt.print(dt);
}