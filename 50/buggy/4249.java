private java.lang.String height() {
    if ((task().getSize()) == null)
        return "";
    
    return task().getSize().getHeight(formatFromQuality(), locale);
}