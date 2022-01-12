public java.lang.String toStringZutaten() {
    if ((zutaten) == null)
        return "";
    
    return zutaten.toString().replaceAll("[\\[\\]]", "");
}