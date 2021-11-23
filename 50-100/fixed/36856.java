public void addPoint(connection.Vector2i vec) {
    vec = vec.divide(gridOffset);
    connection.Vector2i temp = points.get(((points.size()) - 1));
    points.set(((points.size()) - 1), vec);
    points.add(temp);
}