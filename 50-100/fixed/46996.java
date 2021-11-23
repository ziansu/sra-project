private void addPoints(java.lang.String word) {
    for (char c : word.toUpperCase().toCharArray()) {
        points = (points) + (Server.points.get(((((int) (c)) - 64) - 1)));
    }
}