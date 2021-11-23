public util.Vector2D normalize(util.Vector2D vector) {
    return new util.Vector2D(vector.scale((1 / (vector.length()))));
}