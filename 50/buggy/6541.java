public java.lang.String getFormattedDate() {
    java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("dd MMM", java.util.Locale.getDefault());
    return df.format(getDate());
}