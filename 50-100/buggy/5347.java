public static java.lang.String[] getMonthValues() {
    java.util.Calendar now = java.util.Calendar.getInstance();
    java.lang.String[] months = new java.lang.String[4];
    now.add(java.util.Calendar.MONTH, (+1));
    for (int i = 0; i < 4; i++) {
        now.add(java.util.Calendar.MONTH, (-1));
        months[i] = new java.text.SimpleDateFormat("MMMM").format(now.getTime());
    }
    return months;
}