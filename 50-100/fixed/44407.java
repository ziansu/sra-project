public static java.util.Date formatDate(java.lang.String dateString, boolean startOfToday) {
    try {
        if (org.apache.commons.lang3.StringUtils.isBlank(dateString)) {
            return null;
        }
        if (dateString.matches("\\d{2}-\\d{2}-\\d{4}")) {
            return util.JsonFormUtils.dd_MM_yyyy.parse(dateString);
        }else
            if (dateString.matches("\\d{4}-\\d{2}-\\d{2}")) {
                return org.ei.opensrp.clientandeventmodel.DateUtil.parseDate(dateString);
            }
        
    } catch (java.text.ParseException e) {
        android.util.Log.e(util.JsonFormUtils.TAG, "", e);
    }
    return null;
}