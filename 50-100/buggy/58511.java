private void validateInput(javax.swing.JTextField sideBox, javax.swing.JTextField lengthBox) {
    int sides;
    double length;
    sides = getSides(sideBox);
    length = getLength(lengthBox);
    if (!((sides == (-1)) || (length == (-1)))) {
        Calculate(sides, length);
    }
}