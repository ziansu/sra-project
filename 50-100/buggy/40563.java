private java.util.List<java.lang.String> getLabelsYear(int year) {
    java.util.List<java.lang.String> labels = new java.util.ArrayList<java.lang.String>();
    java.util.Calendar cal = java.util.Calendar.getInstance();
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("MMM");
    cal.set(java.util.Calendar.YEAR, year);
    for (int i = 0; i < 12; i++) {
        cal.set(java.util.Calendar.MONTH, i);
        labels.add(sdf.format(cal.getTime()));
    }
    return labels;
}