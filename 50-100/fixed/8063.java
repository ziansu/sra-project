public void init() {
    this.body.setLinearVelocity(0.0F, 0.0F);
    this.body.setTransform((((spawnPosition.x) + ((getWidth()) / 2.0F)) / (com.greenbatgames.rubyred.util.Constants.PTM)), (((spawnPosition.y) + ((getHeight()) / 2.0F)) / (com.greenbatgames.rubyred.util.Constants.PTM)), 0.0F);
    jumped = true;
    facingRight = true;
    grounded = false;
    crouched = false;
    disableCollisionFor = 0.0F;
}