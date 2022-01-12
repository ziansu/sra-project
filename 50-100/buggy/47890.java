public void moveAvatar(graphicslib3D.Vector3D newPos) {
    positionVec = newPos;
    java.lang.System.out.printf("ghostAvatar:moveAvatar(): position vec: %s\n", positionVec.toString());
    graphicslib3D.Matrix3D mat = new graphicslib3D.Matrix3D();
    mat.translate(newPos.getX(), newPos.getY(), newPos.getZ());
    shipObj.setLocalTranslation(mat);
}