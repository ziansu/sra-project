public void setTakeState(int color) {
    if ((this.Color) != color) {
        this.PreviousColor = this.Color;
        this.Color = color;
    }
}