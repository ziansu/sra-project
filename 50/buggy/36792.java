private java.lang.String mediaBrief() {
    if ((task().getMedia()) == null)
        return "";
    
    return task().getMedia().abbreviation();
}