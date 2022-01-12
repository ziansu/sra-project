protected void generate(de.cpgaertner.edu.inf.api.level.LocationFactory factory, int x1, int x2, int y1, int y2) {
    for (int x = x1; x <= x2; x++) {
        for (int y = y1; y <= y2; y++) {
            locations[x][y] = factory.generate(new de.cpgaertner.edu.inf.api.level.Coordinate(x, y));
        }
    }
}