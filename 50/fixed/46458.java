public java.lang.String getPublicationDate() {
    if ((publicationDate) == null)
        return null;
    
    return new java.text.SimpleDateFormat("MMM dd, YYYY", java.util.Locale.US).format(publicationDate.getTime());
}