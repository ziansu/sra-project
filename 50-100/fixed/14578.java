@java.lang.Override
public double averageHeightInRange(int XLeft, int XRight) {
    double totalPoints = numOfPointsInRange(XLeft, XRight);
    if (totalPoints == 0)
        return 0;
    
    double beforeLeft = tree.findHeightBefore(XLeft, false);
    double beforeRight = tree.findHeightBefore(XRight, true);
    return (beforeRight - beforeLeft) / totalPoints;
}