public int deltaCalculation(int[][] imageArrayMoveToCenterOfMass) {
    int delta = 0;
    for (int i = 0; i < (imageArrayMoveToCenterOfMass.length); i++) {
        delta += (java.lang.Math.pow(imageArrayMoveToCenterOfMass[i][1], 2)) - (java.lang.Math.pow(imageArrayMoveToCenterOfMass[i][0], 2));
    }
    return delta;
}