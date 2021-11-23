private static void createObject(java.lang.String line) {
    Town origin = new Town(line.substring(0, 0));
    Town destination = new Town(line.substring(0, 0));
    int distance = ((int) (line.charAt(2)));
    new Track(origin, destination, distance);
    java.lang.System.out.println(origin.getName());
}