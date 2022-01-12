public jath.Vectors.Vector3D getDirection(Point3D point) {
    return new jath.Vectors.Vector3D(((point.getX()) - (getX())), ((point.getY()) - (getY())), ((point.getZ()) - (getZ())));
}