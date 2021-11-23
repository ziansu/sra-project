public java.lang.String headerText() {
    java.lang.String date = new java.text.SimpleDateFormat("MMMM dd").format(this.date);
    return java.lang.String.format("%s  %s", date, this.location);
}