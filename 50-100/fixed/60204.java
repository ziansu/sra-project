public boolean checkNeighbourHeight(CivPackage.Models.Hex[][] map, CivPackage.Util.Point p, int level, int max) {
    int count = 0;
    for (CivPackage.Util.Point n : getNeighbours(p.x, p.y))
        if ((map[n.y][n.x].elevation) == level)
            count++;
        
    
    if (max >= 0)
        return count <= max;
    else
        return count > (java.lang.Math.abs(max));
    
}