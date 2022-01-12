public boolean fire(int numberOfTorpedos) {
    if ((numberOfTorpedos < 1) || (numberOfTorpedos > (this.torpedos))) {
        throw new java.lang.IllegalArgumentException("numberOfTorpedos");
    }
    boolean success = false;
    double r = generator.nextDouble();
    if (r > 0.1) {
        this.torpedos -= numberOfTorpedos;
        success = true;
    }else {
        success = false;
    }
    return success;
}