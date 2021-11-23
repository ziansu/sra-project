public java.lang.String getReleaseDate() {
    java.text.DateFormat format = new java.text.SimpleDateFormat("dd MMMM yyyy", java.util.Locale.FRENCH);
    return format.format(this.release_date);
}