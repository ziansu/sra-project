private void validateInput(javax.swing.JTextField sideBox, javax.swing.JTextField lengthBox) {
    int sides;
    double length;
    sides = getSides(sideBox);
    if (!(sides == (-1))) {
        length = getLength(lengthBox);
        if (!(length == (-1))) {
            Calculate(sides, length);
        }
    }
}