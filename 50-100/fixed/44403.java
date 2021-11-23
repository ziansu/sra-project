public float[][] look(float[][] points) {
    if (isWorldViewDirty) {
        worldView = makeWorldViewMatrix();
        isWorldViewDirty = false;
    }
    float[][] worldViewPoints = base.Mat.matrixPointMult(worldView, points);
    worldViewPoints = base.Mat.matrixPointMult(projectMatrix, worldViewPoints);
    worldViewPoints = perspectiveDivide(worldViewPoints);
    return worldViewPoints;
}