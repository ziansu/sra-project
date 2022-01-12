private void updateState() {
    this.isEmpty = (this.inputBox.getText().length()) == 0;
    if (this.isGhost) {
        this.isEmpty = true;
    }
}