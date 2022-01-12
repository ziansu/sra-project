public void setRotation(int rotateSteps) {
    if (rotateSteps == 0) {
        return ;
    }else
        if (rotateSteps > 0) {
            rotatedKey = originalKey.clone();
            for (int i = 0; i < rotateSteps; i++) {
                rotate();
            }
        }else {
            rotatedKey = originalKey.clone();
            for (int i = 0; i < (java.lang.Math.abs(rotateSteps)); i++) {
                rotateBackwards();
            }
        }
    
}