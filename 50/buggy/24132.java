private static Coordinate<java.lang.Double> reorient(Coordinate<java.lang.Double> target, Coordinate<java.lang.Double> com) {
    return new Coordinate.minus(target, com);
}