private void rotateAroundYAxis(float angle) {
    cameraMatrix.rotate(angle, yAxis[0], yAxis[1], yAxis[2]);
    xAxis = rotateAxis(angle, yAxis, xAxis);
    zAxis = rotateAxis(angle, yAxis, zAxis);
}