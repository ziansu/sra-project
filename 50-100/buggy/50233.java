public jath.Vectors.Vector3D getDirection(Point3D point) {
    return new jath.Vectors.Vector3D(((getX()) - (point.getX())), ((getY()) - (point.getY())), ((getZ()) - (point.getZ())));
}