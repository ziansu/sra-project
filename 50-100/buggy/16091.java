public common.Sector getSectorByCoords(common.Coordinate coordinate) throws java.util.NoSuchElementException {
    java.util.Set<common.Sector> sectors = this.graph.vertexSet();
    for (common.Sector s : sectors) {
        if (s.getCoordinate().equals(coordinate)) {
            return s;
        }
    }
    throw new java.util.NoSuchElementException("No sector with the given coordinates exists");
}