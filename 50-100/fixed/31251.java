public void setYPosition(double YPos) {
    for (int i = (noRectangles) - 1; i > (-1); i--) {
        frogs[i].setYPosition((((frogs[i].getYPosition()) - (frogs[0].getYPosition())) + YPos));
    }
}