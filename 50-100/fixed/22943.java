public boolean moreExpensiveThan(Apartment otherApartment) {
    int aptPrice = (this.squareMeters) * (this.pricePerSquareMeter);
    int otherAptPrice = (otherApartment.squareMeters) * (otherApartment.pricePerSquareMeter);
    if (aptPrice > otherAptPrice) {
        return true;
    }else {
        return false;
    }
}