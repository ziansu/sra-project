public java.util.Date toDate(java.lang.String date) {
    if (!(org.apache.commons.lang.StringUtils.isBlank(date))) {
        try {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
            simpleDateFormat.setLenient(false);
            return simpleDateFormat.parse(date);
        } catch (java.text.ParseException e) {
            throw new java.lang.RuntimeException((("Date format needs to be 'yyyy-MM-dd'. Incorrect Date:" + date) + "."), e);
        }
    }
    return new java.util.Date(0);
}