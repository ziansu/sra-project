protected void generateParticleDirectionVector() {
    ro.uvt.api.util.Vertex pointInFirstSphere = generatePointInSphere(source, aBackupPosition);
    ro.uvt.api.util.Vertex pointInSecondSphere = ro.uvt.api.util.Calculator.add(destination, ro.uvt.api.util.Calculator.subtract(pointInFirstSphere, source));
    ro.uvt.api.util.Vertex differenceVector = ro.uvt.api.util.Calculator.subtract(pointInSecondSphere, pointInFirstSphere);
    startPosition = pointInFirstSphere;
    acceleration = ro.uvt.api.util.Calculator.scaleDown(differenceVector, scalar);
}