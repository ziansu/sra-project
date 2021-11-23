@java.lang.Override
public double averageHeightInRange(int XLeft, int XRight) {
    double beforeLeft = tree.findHeightBefore(XLeft, false);
    double beforeRight = tree.findHeightBefore(XRight, true);
    double totalPoints = numOfPointsInRange(XLeft, XRight);
    return (beforeRight - beforeLeft) / totalPoints;
}