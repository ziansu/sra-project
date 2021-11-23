public static nben.mesh.registration.AnglePotential newWellAnglePotential(int[][] T, double[][] X) {
    return new nben.mesh.registration.AnglePotential(new nben.mesh.registration.InfiniteWellFunction((1.0 / (3 * (T[0].length))), 0.0, java.lang.Math.PI), nben.mesh.registration.Util.facesToAngles(T), X);
}