@java.lang.Override
public msi.gama.util.path.GamaSpatialPath pathBetween(final msi.gama.runtime.IScope scope, final msi.gama.metamodel.topology.grid.IShape source, final msi.gama.metamodel.topology.grid.IShape target) throws msi.gama.runtime.exceptions.GamaRuntimeException {
    return getPlaces().computeShortestPathBetween(scope, source, target, this, null);
}