public static java.lang.String convertGoodDataDateToString(java.lang.String value) {
    org.joda.time.DateTime dt;
    try {
        int l = java.lang.Integer.parseInt(value);
        if (l == 0)
            return "";
        
        dt = com.gooddata.util.DateUtil.base.plusDays((l - 1));
    } catch (java.lang.NumberFormatException e) {
        return "";
    }
    return com.gooddata.util.DateUtil.baseFmt.print(dt);
}