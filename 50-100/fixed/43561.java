private double interpolateAvRating(double av1, double av2, int year1, int year2, int now) {
    if (year1 == year2) {
        return av1;
    }
    return av1 + (((av2 - av1) * (now - year1)) / (year2 - year1));
}