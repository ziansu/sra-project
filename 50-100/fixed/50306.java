private static java.util.List<Coordinate<java.lang.Integer>> convertToHCS(java.util.List<Coordinate<java.lang.Double>> listOfCoords, Coordinate<java.lang.Double> com) {
    java.util.List<Coordinate<java.lang.Integer>> HCSCoords = new java.util.ArrayList<Coordinate<java.lang.Integer>>();
    for (Coordinate<java.lang.Double> c : listOfCoords) {
        HCSCoords.add(HCS.cartToHex(InitMax.reorient(c, com)));
    }
    return HCSCoords;
}