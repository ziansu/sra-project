private boolean checkDelaunay() {
    for (pfg.kraken.dstarlite.navmesh.NavmeshEdge e : edgesInProgress)
        assert !(e.flipIfNecessary()) : e;
    
    return true;
}