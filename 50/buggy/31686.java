public static applications.trajectory.geom.point.Point4D from(applications.trajectory.geom.point.Point3D arg, double angle) {
    return new applications.trajectory.geom.point.AutoValue_Point4D(arg.getX(), arg.getY(), arg.getZ(), 0);
}