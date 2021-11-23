public static double getDepth(net.minecraft.util.math.Vec3d point) {
    net.minecraft.util.math.Vec3d camLoc = de.unratedfilms.moviefocus.fmlmod.util.GeometryUtils.getCamLoc();
    net.minecraft.util.math.Vec3d camSightLine = de.unratedfilms.moviefocus.fmlmod.util.GeometryUtils.getCamSightLine();
    return camSightLine.dotProduct(camLoc.subtract(point));
}