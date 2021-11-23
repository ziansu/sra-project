public static org.matsim.api.core.v01.Coord rotateToRight(org.matsim.api.core.v01.Coord coord) {
    if (coord.hasZ()) {
        final double y = -(coord.getX());
        return new org.matsim.api.core.v01.Coord(coord.getY(), y);
    }else {
        final double y = -(coord.getX());
        return new org.matsim.api.core.v01.Coord(coord.getY(), y, coord.getZ());
    }
}