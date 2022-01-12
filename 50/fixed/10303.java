static java.util.List<PolygonalNumber> checkSolution(int size, java.util.List<PolygonalNumber> partial, PolygonalNumber p) {
    partial.add(0, p);
    if (CyclicalFigurate.isSolution(size, partial))
        return partial;
    
    return null;
}