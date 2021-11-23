public io.github.teamfractal.entity.LandPlot getPlot(int x, int y) {
    if ((((x < 0) || (x >= (width))) || (y < 0)) || (y >= (height)))
        return null;
    
    io.github.teamfractal.entity.LandPlot p = plots[x][y];
    if (p == null) {
        p = createLandPlot(x, y);
    }
    return p;
}