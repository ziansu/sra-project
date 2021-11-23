private static List<Coordinate<java.lang.Integer>> convertToHCS(List<Coordinate<java.lang.Double>> listOfCoords, Coordinate<java.lang.Double> com) {
    List<Coordinate<java.lang.Integer>> HCSCoords = new ArrayList<Coordinate<java.lang.Integer>>();
    for (Coordinate<java.lang.Double> c : listOfCoords) {
        HCSCoords.add(HCS.cartToHex(InitMax.reorient(c, com)));
    }
    return HCSCoords;
}