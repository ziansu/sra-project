public double value(graphgui.Tuple[] coordinates) {
    double value = 0;
    for (int i = 0; i < (g.vertexCount()); i++) {
        for (int j = i + 1; j < (g.vertexCount()); j++) {
            value += distance(i, j, coordinates);
        }
    }
    return value;
}