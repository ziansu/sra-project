public static java.lang.String[] getMonthValues(int length) {
    java.util.Calendar now = java.util.Calendar.getInstance();
    java.lang.String[] months = new java.lang.String[length];
    now.add(java.util.Calendar.MONTH, (+1));
    for (int i = 0; i < length; i++) {
        now.add(java.util.Calendar.MONTH, (-1));
        months[i] = new java.text.SimpleDateFormat("MMMM").format(now.getTime());
    }
    return months;
}