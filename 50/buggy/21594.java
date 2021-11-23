public void initialize(org.swerverobotics.library.internal.Parameters parameters) {
    this.parameters = parameters;
    resetINA219();
    delayLore(20);
}