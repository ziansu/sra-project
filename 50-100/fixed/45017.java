public void pitch(float angle) {
    if (angle == 0)
        return ;
    
    forward = forward.rotated(angle, new com.studioussoftware.paperescaper.game.Vector3(1, 0, 0)).normalized();
    com.studioussoftware.paperescaper.game.Vector3 right = com.studioussoftware.paperescaper.game.Vector3.cross(forward, new com.studioussoftware.paperescaper.game.Vector3(0, 1, 0)).normalized();
    up = com.studioussoftware.paperescaper.game.Vector3.cross(right, forward).normalized();
}