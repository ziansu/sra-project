@java.lang.Override
public java.lang.String formatLabel(double value, boolean isValueX) {
    if (isValueX) {
        long totalSeconds = new java.lang.Double(value).longValue();
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(new java.util.Date(totalSeconds));
        int day = cal.get(java.util.Calendar.DAY_OF_MONTH);
        int month = (cal.get(java.util.Calendar.MONTH)) + 1;
        return java.lang.String.format(((day + ".") + month));
    }else {
        return super.formatLabel(value, isValueX);
    }
}