public void runCycle() {
    if (runs) {
        return ;
    }
    this.runs = true;
    this.frame.setButtonsEnabled(false);
    this.parse();
    this.adjust();
    this.frame.updateUIs();
    this.frame.setButtonsEnabled(true);
    this.runs = false;
}