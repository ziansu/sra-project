public double getPrice(int daysRented) {
    if ((this.rs) == null) {
        return 0.0;
    }
    return this.rs.getRentalCharge(daysRented);
}