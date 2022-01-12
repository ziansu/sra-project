public java.util.HashMap<java.lang.Long, java.lang.String> getCategoryMap() {
    java.lang.String dump = sharedPrefs.getString(org.cm.podd.report.util.SharedPrefUtil.REPORT_TYPE_CATEGORY, null);
    if (dump == null) {
        return new java.util.HashMap<java.lang.Long, java.lang.String>();
    }
    return ((java.util.HashMap<java.lang.Long, java.lang.String>) (org.cm.podd.report.util.ObjectSerializerHelper.stringToObject(dump)));
}