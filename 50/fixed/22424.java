public double getRating() {
    if ((rating.totalNumberOfRatings) == 0)
        return -1;
    
    return ((double) (rating.totalSumOfRatings)) / (rating.totalNumberOfRatings);
}