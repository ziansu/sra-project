private void refreshTime() {
    java.util.Calendar c = java.util.Calendar.getInstance();
    if ((tvTime) != null) {
        tvTime.setText(java.lang.String.format("%d:%d", c.get(java.util.Calendar.HOUR_OF_DAY), c.get(java.util.Calendar.MINUTE)));
    }
}