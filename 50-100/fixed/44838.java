private void getDateForDatePicker() {
    if (addMode) {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        day = cal.get(java.util.Calendar.DAY_OF_MONTH);
        month = cal.get(java.util.Calendar.MONTH);
        year = cal.get(java.util.Calendar.YEAR);
        java.lang.System.out.println();
    }else {
        day = showingHomework.getDeadline().get(java.util.Calendar.DAY_OF_MONTH);
        month = showingHomework.getDeadline().get(java.util.Calendar.MONTH);
        year = showingHomework.getDeadline().get(java.util.Calendar.YEAR);
    }
}