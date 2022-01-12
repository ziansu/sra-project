public void increaseImage(double increasment) {
    if (((this.getAirline().getImage()) + increasment) <= 100) {
        this.getAirline().setImage(((this.getAirline().getImage()) + (increasment * (this.getEfficiency()))));
    }else {
        this.getAirline().setImage(100.0);
    }
}