public void setMilage(int milage) {
    if ((milage < 0) && (milage > 1000000)) {
        throw new java.lang.IllegalArgumentException("Milage must be between 0, and 1 000 000 miles");
    }else {
        this.milage = milage;
    }
}