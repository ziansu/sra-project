public void setRotation(int rotateSteps) {
    rotatedKey = originalKey.clone();
    if (rotateSteps == 0) {
        return ;
    }else
        if (rotateSteps > 0) {
            for (int i = 0; i < rotateSteps; i++) {
                rotate();
            }
        }else {
            for (int i = 0; i < (java.lang.Math.abs(rotateSteps)); i++) {
                rotateBackwards();
            }
        }
    
}