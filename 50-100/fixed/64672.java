public void moveCamera(float distance, javax.vecmath.Vector3f axis) {
    if (distance == 0) {
        return ;
    }
    javax.vecmath.Vector3f changeVector = new javax.vecmath.Vector3f(axis);
    changeVector.normalize();
    changeVector.scale(distance);
    cameraMatrix.translate((-(changeVector.x)), (-(changeVector.y)), changeVector.z);
    curPosition.add(changeVector);
}