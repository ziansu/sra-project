public void set_nrOfNights(int nights_wanted) {
    if (nights_wanted < 0)
        throw new java.lang.IllegalArgumentException("Error: You must book at least one whole night");
    
    nrOfNights = nights_wanted;
}