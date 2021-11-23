private void updateTimeTaken() {
    this.expTime = (this.BASE_TIME) / (((this.level) / 10) + 1);
    this.repairTime = (this.expTime) / 1000;
}