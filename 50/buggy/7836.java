public void UpdatePower(double power) {
    if ((power > 0) && (power <= 120000)) {
        this.power = power;
    }
}