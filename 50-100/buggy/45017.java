public void pitch(float angle) {
    if (angle == 0)
        return ;
    
    com.studioussoftware.paperescaper.game.Vector3 right = getRight();
    forward = forward.rotated(angle, right).normalized();
    up = com.studioussoftware.paperescaper.game.Vector3.cross(right, forward).normalized();
}