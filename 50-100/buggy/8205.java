public static nben.mesh.registration.AnglePotential newWellAnglePotential(double scale, int[][] T, double[][] X) {
    return new nben.mesh.registration.AnglePotential(new nben.mesh.registration.InfiniteWellFunction((scale / (3 * (T[0].length))), 0.0, (0.5 * (java.lang.Math.PI))), nben.mesh.registration.Util.facesToAngles(T), X);
}