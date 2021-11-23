public app.symbolize.Common.Line Get_intersecting_line(app.symbolize.Common.Posn point) {
    int min_distance_squared = app.symbolize.Game.GameModel.TAPING_THRESHOLD;
    app.symbolize.Common.Line target_line = null;
    for (app.symbolize.Common.Line line : graph) {
        int new_distance_squared = point.Distance_squared(line);
        if (new_distance_squared <= min_distance_squared) {
            min_distance_squared = new_distance_squared;
            target_line = line;
        }
    }
    return target_line;
}