private static double[] getElementAngels(int elem) {
    double[] definedAngels = LeapCalcFunctions.getDefinedAngels();
    if (definedAngels == null) {
        return null;
    }
    double[] angels = new double[2];
    angels[0] = definedAngels[(elem - 1)];
    angels[1] = definedAngels[elem];
    return angels;
}