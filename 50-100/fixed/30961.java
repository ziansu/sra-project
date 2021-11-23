public final mytown.datasource.Plot newPlot(java.lang.String name, mytown.datasource.Town town, int dim, int x1, int y1, int z1, int x2, int y2, int z2) {
    mytown.datasource.Plot plot = new mytown.datasource.Plot(name, town, dim, x1, y1, z1, x2, y2, z2);
    if (mytown.datasource.PlotEvent.fire(new mytown.datasource.PlotEvent.PlotCreateEvent(plot)));
    return null;
    return plot;
}