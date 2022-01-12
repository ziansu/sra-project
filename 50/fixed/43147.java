public void setTakeState(int color) {
    if ((this.Color) != color) {
        this.previousStates.add(this.Color);
        this.Color = color;
    }
}