public void onPlayerUpdate() {
    net.gtaun.shoebill.object.impl.SampNativeFunction.getPlayerVelocity(this.id, velocity);
    (updateCount)++;
    if ((updateCount) < 0)
        updateCount = 0;
    
}