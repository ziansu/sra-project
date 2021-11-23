public void jump() {
    if ((this.velocity.y) == 0) {
        this.velocity = new Vector(((this.velocity.x) + (SPEED)), ((this.velocity.y) - (JUMP_HEIGHT)));
        if (colliding) {
            this.velocity.x = 0;
        }
    }
}