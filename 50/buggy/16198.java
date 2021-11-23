public static javax.vecmath.Point3d[] generatePointsOnSphere(javax.vecmath.Point3d sphereOrigin, double sphereRadius, int numberOfPointsToGenerate) {
    return us.ihmc.robotics.geometry.SpiralBasedAlgorithm.generatePointsOnSphere(new javax.vecmath.Point3d(), sphereRadius, numberOfPointsToGenerate, us.ihmc.robotics.geometry.SpiralBasedAlgorithm.computeMagicDeltaN(numberOfPointsToGenerate));
}