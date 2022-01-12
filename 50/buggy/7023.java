public void checkOut(Media media) {
    if ((!media) instanceof CheckOutable) {
        throw new java.lang.IllegalArgumentException("Can't check out Media that is not also CheckOutable.");
    }
    return ;
}