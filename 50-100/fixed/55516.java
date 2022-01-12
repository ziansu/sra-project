public void findPolarAngle() {
    for (int i = 0; i < (pointArray.length); i++) {
        pointArray[i].polarAngleToOrigin = java.lang.Math.toDegrees(java.lang.Math.atan(((pointArray[i].yPos) / (pointArray[i].xPos))));
    }
}