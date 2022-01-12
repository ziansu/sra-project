public void setHotelOnStreetPurple(int purpleNumber, int hotel) {
    houseOnStreetPurple[(purpleNumber - 1)] += hotel;
    totalHotelsOwned += hotel;
    totalHotelsOnStreetPurple += hotel;
}