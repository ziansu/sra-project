public java.awt.Color getColor() {
    if ((brickType) < 0) {
        return new java.awt.Color(0, 0, 0, 0);
    }
    return this.color[brickType];
}