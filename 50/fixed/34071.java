@java.lang.Override
public boolean fitsSearchType(jsettlers.algorithms.path.IPathCalculatable pathCalculable, jsettlers.common.position.ShortPoint2D position, jsettlers.common.material.ESearchType searchType) {
    return pathfinderGrid.fitsSearchType(position.x, position.y, searchType, pathCalculable);
}