private void updateTimeTaken() {
    this.experienceTime = (this.BASE_TIME) / (((this.level) / 10) + 1);
    this.repairTime = (this.experienceTime) * 2;
    if ((this.experienceTime) < 0.5) {
        this.experienceTime = ((float) (0.5));
    }
    if ((this.repairTime) < 1.0) {
        this.repairTime = ((float) (1.0));
    }
}