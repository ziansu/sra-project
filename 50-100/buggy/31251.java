public void setYPosition(double YPos) {
    for (int i = 0; i < (noRectangles); i++) {
        frogs[i].setYPosition((((frogs[i].getYPosition()) - (frogs[0].getYPosition())) + YPos));
    }
}