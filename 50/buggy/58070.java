@java.lang.Override
public jsettlers.algorithms.path.Path searchDijkstra(jsettlers.algorithms.path.IPathCalculatable pathCalculateable, short centerX, short centerY, short radius, jsettlers.common.material.ESearchType searchType) {
    return dijkstra.find(pathCalculateable, centerX, centerY, ((short) (1)), radius, searchType);
}