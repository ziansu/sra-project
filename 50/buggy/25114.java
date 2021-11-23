public java.lang.String getWithinString() {
    if (within.contains("<s>")) {
        return "sentence";
    }else
        if (within.contains("<p>")) {
            return "paragraph";
        }
    
    return "document";
}