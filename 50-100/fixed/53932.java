private java.lang.String getFormattedTitle(java.lang.String title, java.lang.String location) {
    if ((location != null) && (!(location.isEmpty()))) {
        return (((title + " ") + (context.getString(R.string.at))) + " ") + location;
    }
    return title;
}