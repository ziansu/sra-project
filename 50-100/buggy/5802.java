@java.lang.Override
@msi.gama.precompiler.GamlAnnotations.getter(value = "points")
public msi.gama.metamodel.shape.IList<? extends msi.gama.metamodel.shape.ILocation> getPoints() {
    final msi.gama.metamodel.shape.IList<msi.gama.metamodel.shape.GamaPoint> result = msi.gama.metamodel.shape.GamaListFactory.create(Types.POINT);
    final msi.gama.metamodel.shape.Coordinate[] points = getInnerGeometry().getCoordinates();
    for (final msi.gama.metamodel.shape.Coordinate c : points) {
        result.add(new msi.gama.metamodel.shape.GamaPoint(c));
    }
    return result;
}