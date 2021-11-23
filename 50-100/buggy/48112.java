private void selfRotation(float angle, javax.vecmath.Vector3f axis) {
    cameraMatrix.translate((-(curPosition.x)), (-(curPosition.y)), (-(curPosition.z)));
    cameraMatrix.rotate(angle, axis.x, axis.y, axis.z);
    cameraMatrix.translate(curPosition.x, curPosition.y, curPosition.z);
}