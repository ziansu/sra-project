@java.lang.Override
void AI(Bleach.LevelInteractable activeLevel) {
    if (((java.lang.System.nanoTime()) % 1000000000) == 0) {
        bMoving = !(bMoving);
        if (bMoving)
            setVectorAngle(((java.lang.Math.random()) * (2 * (java.lang.Math.PI))));
        
    }
}