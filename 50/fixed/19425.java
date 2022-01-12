public double getMonthlyImageIncreasement() {
    double increasementByAdvertisement = this.getAirline().getINTERNETAD().getMonthlyImageIncreasement();
    return (monthlyImageIncreasement) + increasementByAdvertisement;
}