private static void createObject(java.lang.String line) {
    Town origin = new Town(line.substring(0, 1));
    Town destination = new Town(line.substring(1, 2));
    int distance = java.lang.Integer.parseInt(line.substring(2));
    new Track(origin, destination, distance);
}