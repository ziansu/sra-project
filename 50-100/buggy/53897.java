private java.lang.String getLineDate() {
    try {
        if ((m_props.getProperty("clock.date")) == "") {
            return Formats.SIMPLEDATE.formatValue(new java.util.Date());
        }else {
            formatter = new java.text.SimpleDateFormat(m_props.getProperty("clock.date"));
            return formatter.format(new java.util.Date());
        }
    } catch (java.lang.IllegalArgumentException e) {
        return Formats.SIMPLEDATE.formatValue(new java.util.Date());
    }
}