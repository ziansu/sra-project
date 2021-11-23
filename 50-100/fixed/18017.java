public float[][] valueToGrid(float[][] value) throws visad.VisADException {
    if ((Length) > 1) {
        for (int j = 0; j < (DomainDimension); j++) {
            if ((Lengths[j]) < 2) {
                throw new visad.SetException(("GriddedSet.valueToGrid: requires all grid " + "dimensions to be > 1"));
            }
        }
    }
    throw new visad.UnimplementedException("GriddedSet.valueToGrid");
}