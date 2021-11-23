public java.lang.String getFullTitle() {
    if ((fulltitle) == null) {
        fulltitle = ((subtitle) != null) ? ((title) + " ") + (subtitle) : title;
    }
    return fulltitle;
}