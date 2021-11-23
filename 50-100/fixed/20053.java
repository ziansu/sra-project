public boolean yCollide(float yMov, GameEngine.Collider other) {
    if (other != (this)) {
        boolean wasGrounded = physics.isGrounded();
        if (yIntersect(yMov, other)) {
            if ((!wasGrounded) && (yMov > 0)) {
                owner.doEvent(Constants.Event.collision);
            }else
                if (yMov < 0) {
                    owner.doEvent(Constants.Event.collision);
                }
            
            return true;
        }
    }
    return false;
}