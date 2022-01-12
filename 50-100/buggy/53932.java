private java.lang.String getFormattedTitle(java.lang.String title, java.lang.String location) {
    if (!(location.isEmpty())) {
        return (((title + " ") + (context.getString(R.string.at))) + " ") + location;
    }
    return title;
}